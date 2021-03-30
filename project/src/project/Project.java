/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
        
/**
 *
 * @author Drazic
 * @author Nicolas
 * 
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LogIn log = new LogIn();
        User user = BDD.login("drazic9@live.fr","dm");
        System.out.println(user.lastname);
        
        BDD.exempleAddUser();
        //LogIn2.main(args);
        //
    }
    
}