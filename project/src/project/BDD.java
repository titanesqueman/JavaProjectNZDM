
package project;


import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import project.Tokeniser.Token;
import static project.Tokeniser.getToken;

/**
 *
 * @author Drazic
 */
public class BDD {

    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname  = "java";
    private static Integer portnumber  = 3306;
    private static String password = "";
    
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
            
            st = BDD.getConnection().prepareStatement(query);
            
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
            
            st = BDD.getConnection().prepareStatement(query);
            
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
                    case BUYER -> user = new Buyer(userId,firstname,lastname,phonenumber,email);
                    case SELLER -> user = new Seller(userId,firstname,lastname,phonenumber,email,token);
                    case EMPLOYEE -> user = new Employee(userId,firstname,lastname,phonenumber,email);
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

    static boolean isFav(int propertyId, int userId) {
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "SELECT * "
                    + "     FROM fav "
                    + "     WHERE propertyId = ? AND userId = ? ";
            
            st = BDD.getConnection().prepareStatement(query);
            
            st.setInt(1,propertyId);
            st.setInt(2,userId);
            
            rs = st.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    static void setFav(int propertyId, int userId) {
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "INSERT INTO fav(propertyId,userId) "
                    + "     VALUES(?,?)";
            
            st = BDD.getConnection().prepareStatement(query);
            
            st.setInt(1,propertyId);
            st.setInt(2,userId);
            
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void deleteFav(int propertyId, int userId) {
        try {
            PreparedStatement st;
            ResultSet rs;
            
            String query = "DELETE"
                    + "     FROM fav "
                    + "     WHERE propertyId = ? AND userId = ?";
            
            st = BDD.getConnection().prepareStatement(query);
            
            st.setInt(1,propertyId);
            st.setInt(2,userId);
            
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}