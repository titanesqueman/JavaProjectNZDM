/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author nicol
 * @author drazic
 */
public class user {
    protected String name;
    protected String emailAddress;
    protected String password;
    public String token;

    public user(String name, String emailAddress, String password, String token) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.password = password;
        this.token = token;
    }
    
}
