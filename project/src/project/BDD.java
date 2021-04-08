
package project;


import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import project.Tokeniser.Token;
import static project.Tokeniser.getToken;

/**
 *
 * @author Drazic
 */
public class BDD {

    private static final String servername = "localhost";
    private static final String username = "root";
    private static final String dbname  = "java";
    private static final Integer portnumber  = 3306;
    private static final String password = "";
    
    public static Connection getConnection() throws SQLException
    {
        Connection cnx = null;

        MysqlDataSource datasource = new MysqlDataSource();

        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);

        cnx = datasource.getConnection();

        return cnx;    
    }
    
    public static void exempleGetInfo(){
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "SELECT * FROM users";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            
            rs = st.executeQuery();
            
            while(rs.next()){
                System.out.println("Id : " + rs.getInt("id"));
                //System.out.println("Name : " + rs.getString(2));
                System.out.println("Email : " + rs.getString("email"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void exempleAddUser(){
        String firstname = "DRAZIC";
        String lastname = "MARTIN";
        String phonenumber = "0781044869";
        String email = "b";
        String password = "b";
        String tokenId = "BUYER";
        int gender = 1;
        System.out.println(register(tokenId, firstname, lastname, phonenumber, email, password, gender));
    }
    
    // try to connect user 
    // return a user
    // return null if the user is not found in the table
    public static User login(String email, String password){
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "SELECT * "
                    +  "    FROM users "
                    + "     WHERE email = ? AND password = ? ";
            
            Connection cnx = BDD.getConnection();
            st = cnx.prepareStatement(query);
            
            st.setString(1,email);
            st.setString(2,password);
            
            rs = st.executeQuery();
            
            if(rs.next()){
                int userId = rs.getInt("userId");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String phonenumber = rs.getString("phonenumber");
                Token token = getToken(rs.getString("token"));
                
                User user;
                
                if (null == token){
                    System.out.println("token not reconized");
                    return null;
                }else switch (token) {
                    case BUYER -> user = new Buyer(userId,firstname,lastname,phonenumber,email,cnx);
                    case SELLER -> user = new Seller(userId,firstname,lastname,phonenumber,email,token,cnx);
                    case EMPLOYEE -> user = new Employee(userId,firstname,lastname,phonenumber,email,cnx);
                    default -> {
                        System.out.println("token not reconized");
                        return null;
                    }
                }
                //return the connected user
                return user;
            }else{
                // wrong password or email -> not found in the db
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public static String register(String tokenId, String firstname, String lastname, String phonenumber, String email, String password, int gender){
        
        try {
            PreparedStatement st;
            ResultSet rs;
            
            if (isEmailAlreadyUse(email)) return"email already use";
            
            String query = "INSERT INTO users(token,firstname,lastname,phonenumber,email,password,gender)"
                    + "     VALUES (?,?,?,?,?,?,?)";
            
            st = BDD.getConnection().prepareStatement(query);
            
            st.setString(1, tokenId);
            st.setString(2, firstname);
            st.setString(3, lastname);
            st.setString(4, phonenumber);
            st.setString(5, email);
            st.setString(6, password);
            st.setInt(7, gender);
            
            st.executeUpdate();
            
            return "Success";
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error";
    }

    // return 
    private static boolean isEmailAlreadyUse(String email) {
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "SELECT email "
                    + "     FROM users "
                    + "     WHERE email = ?";
            
            st = BDD.getConnection().prepareStatement(query);
            
            st.setString(1,email);
            
            rs = st.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // return if the property is fav for the user
    static boolean isFav(int propertyId, int userId) {
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "SELECT * "
                    + "     FROM fav "
                    + "     WHERE propertyId = ? AND userId = ? ";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            
            st.setInt(1,propertyId);
            st.setInt(2,userId);
            
            rs = st.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // set in fav a property to a user
    static void setFav(int propertyId, int userId) {
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "INSERT INTO fav(propertyId,userId) "
                    + "     VALUES(?,?)";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            
            st.setInt(1,propertyId);
            st.setInt(2,userId);
            
            st.executeUpdate();
            
            st.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // delete fav to a user 
    static void deleteFav(int propertyId, int userId) {
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "DELETE"
                    + "     FROM fav "
                    + "     WHERE propertyId = ? AND userId = ?";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            
            st.setInt(1,propertyId);
            st.setInt(2,userId);
            
            st.executeUpdate();
            
            st.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // return Result set with a certain property filter
    static ResultSet propertiesFilter(int minPrice, int maxPrice, int minArea, int maxArea, String sortBy, String orderBy){
        PreparedStatement st;
        ResultSet rs;
        try {
            String query = String.format("SELECT * "
                    + "     FROM property"
                    + "     WHERE (area BETWEEN ? AND ?)"
                    + "     AND   (price BETWEEN ? AND ?)"
                    + "     AND isSell = false"
                    + "     ORDER BY %s %s", sortBy, orderBy);
 
            st = MainWindow.getUser().getCon().prepareStatement(query);
            
            st.setInt(1, minArea);
            st.setInt(2, maxArea);
            st.setInt(3, minPrice);
            st.setInt(4, maxPrice);
            //st.setString(5, sortBy);
            //st.setString(6, orderBy);
            
            rs = st.executeQuery();
            
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    // return Result set with a certain property filter
    static ResultSet propertiesFilterOnlyFav(int userId, int minPrice, int maxPrice, int minArea, int maxArea, String sortBy, String orderBy){
        PreparedStatement st;
        ResultSet rs;
        try {
            String query = String.format("SELECT * "
                    + "     FROM property p"
                    + "     INNER JOIN users u"
                    + "     INNER JOIN fav f"
                    + "     ON f.userId = u.userId AND p.propertyId = f.propertyId"
                    + "     WHERE (area BETWEEN ? AND ?)"
                    + "     AND   (price BETWEEN ? AND ?)"
                    + "     AND isSell = false"
                    + "     ORDER BY %s %s", sortBy, orderBy);

            st = MainWindow.getUser().getCon().prepareStatement(query);
            
            st.setInt(1, minArea);
            st.setInt(2, maxArea);
            st.setInt(3, minPrice);
            st.setInt(4, maxPrice);
            //st.setString(5, sortBy);
            //st.setString(6, orderBy);
            
            rs = st.executeQuery();
            
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static String addProperty(int sellerId, String title, double area, String address, int price, String description){
        
        try {
            PreparedStatement st;
            ResultSet rs;
            
            
            String query = "INSERT INTO property(sellerId,title,area,address,price,description)"
                    + "     VALUES (?,?,?,?,?,?)";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            
            st.setInt(1, sellerId);
            st.setString(2, title);
            st.setDouble(3, area);
            st.setString(4, address);
            st.setInt(5, price);
            st.setString(6,description);
            
            st.executeUpdate();
            
            return "Success";
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error";
    }
    
    public static boolean hasBuyerAlreadyReservedViewing(int userId, int propertyId){
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "SELECT * "
                    + "     FROM viewing "
                    + "     WHERE userId = ? AND propertyId = ? AND datetime >= CURRENT_TIMESTAMP";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            st.setInt(1,userId);
            st.setInt(2,propertyId);
            
            rs = st.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static ResultSet getOneViewing(int userId, int propertyId){
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "SELECT * "
                    + "     FROM viewing v"
                    + "     INNER JOIN property p"
                    + "     ON v.propertyId = p.propertyId"
                    + "     WHERE v.userId = ? AND v.propertyId = ? AND datetime >= CURRENT_TIMESTAMP";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            st.setInt(1,userId);
            st.setInt(2,propertyId);
            
            rs = st.executeQuery();
            
            return rs;
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static boolean isBooked(int propertyId, int year, int month, int day, int hour){
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "SELECT * "
                    + "     FROM viewing "
                    + "     WHERE propertyId = ? AND year = ? AND month = ? AND day = ? AND hour = ?";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            st.setInt(1,propertyId);
            st.setInt(2,year);
            st.setInt(3,month);
            st.setInt(4,day);
            st.setInt(5,hour);
            
            rs = st.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static boolean isMyProperty(int sellerId, int propertyId){
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "SELECT * "
                    + "     FROM property "
                    + "     WHERE sellerId = ? AND propertyId = ?";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            st.setInt(1,sellerId);
            st.setInt(2,propertyId);
            
            rs = st.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static String addViewing(int userId, int propertyId, int year, int month, int day, int hour){
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "INSERT INTO viewing(userId, propertyId,year,month,day,hour,datetime)"
                    + "     VALUES (?,?,?,?,?,?,?)";
            
            st = BDD.getConnection().prepareStatement(query);
            
            String myDate = String.format("%04d/%02d/%02d %02d:00:00",year,month,day,hour);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date;
            try {
                date = sdf.parse(myDate);
                long timeInMillis = date.getTime();
                Timestamp tmstmp = new Timestamp(timeInMillis);
                st.setInt(1, userId);
                st.setInt(2, propertyId);
                st.setInt(3, year);
                st.setInt(4, month);
                st.setInt(5, day);
                st.setInt(6, hour);
                st.setTimestamp(7, tmstmp);
                
                st.executeUpdate();
                return "Success";
                
            } catch (ParseException ex) {
                Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
                return "Error";
            }
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error";
    }
    
    public static int getOffer(int propertyId, int buyerId){
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "SELECT price "
                    + "     FROM offers "
                    + "     WHERE buyerId = ? AND propertyId = ?";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            st.setInt(2,propertyId);
            st.setInt(1,buyerId);
            
            rs = st.executeQuery();
            int result = 11;
            if (rs.next()){
                result = rs.getInt("price");
            }
            //System.out.println(rs.getInt(1));
            return result;
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(" non ");
        return 0;
        
        
    }
    
    public static String addOffer(int propertyId, int buyerId, int price){
        try {
            PreparedStatement st;
            ResultSet rs;
            
            
            String query = "INSERT INTO offers(propertyId,buyerId,price)"
                    + "     VALUES (?,?,?)";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            
            st.setInt(1, propertyId);
            st.setInt(2, buyerId);
            st.setInt(3, price);
            
            st.executeUpdate();
            
            return "Success";
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error";
    }
    
    public static boolean isWithOffer(int propertyId, int buyerId){
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "SELECT * "
                    + "     FROM offers "
                    + "     WHERE propertyId = ? AND buyerId = ?";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            st.setInt(1,propertyId);
            st.setInt(2,buyerId);
            
            rs = st.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // get ResultSet 
    public static ResultSet getSellerViewing(int sellerId){
        PreparedStatement st;
        ResultSet rs;
        try {
            String query =
                      "     SELECT * "
                    + "     FROM viewing v"
                    + "     INNER JOIN property p"
                    + "     ON v.propertyId = p.propertyId"
                    + "     INNER JOIN users u"
                    + "     ON p.sellerId = u.userId"
                    + "     WHERE u.userId = ? AND v.datetime >= CURRENT_TIMESTAMP"
                    + "     ORDER BY v.datetime ASC";
 
            st = MainWindow.getUser().getCon().prepareStatement(query);
            
            st.setInt(1, sellerId);
            
            rs = st.executeQuery();
            
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static ResultSet getBuyerViewing(int userId){
        PreparedStatement st;
        ResultSet rs;
        try {
            String query =
                      "     SELECT * "
                    + "     FROM viewing v"
                    + "     INNER JOIN property p"
                    + "     ON v.propertyId = p.propertyId"
                    + "     WHERE v.userId = ? AND v.datetime >= CURRENT_TIMESTAMP"
                    + "     ORDER BY v.datetime ASC";
 
            st = MainWindow.getUser().getCon().prepareStatement(query);
            
            st.setInt(1, userId);
            
            rs = st.executeQuery();
            
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static boolean canSetSellProperty(int userId, int propertyId){
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "SELECT * "
                    + "     FROM property "
                    + "     WHERE propertyId = ? AND sellerId = ? ";
            
            st = MainWindow.getUser().getCon().prepareStatement(query);
            
            st.setInt(1,propertyId);
            st.setInt(2,userId);
            
            rs = st.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static String setPropertySelled(int propertyId) {
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "UPDATE property " +
                            "SET isSell = true " +
                            "WHERE propertyId = ?";
            
            st = BDD.getConnection().prepareStatement(query);
            
            st.setInt(1, propertyId);
            
            st.executeUpdate();
            
            return "Success";
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error";
    }
    
    public static String updateProperty(int propertyId, String title, double area, String address, int price, String description) {
        try {
            PreparedStatement st;
            ResultSet rs;
            String query = "UPDATE property " 
                            +"SET title = ? , area = ? , address = ? , price = ? , description = ?"
                            + "WHERE propertyId = ?";
            
            st = BDD.getConnection().prepareStatement(query);
            
           
            st.setString(1, title);
            st.setDouble(2, area);
            st.setString(3, address);
            st.setInt(4, price);
            st.setString(5,description);
            st.setInt(6, propertyId);
            
            st.executeUpdate();
            
            return "Success";
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error";
    }
}