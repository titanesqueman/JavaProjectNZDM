/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import project.Tokenizer.Token;

/**
 *
 * @author nicol
 * @author drazic
 */
public class User {
    protected int userId;
    protected String firstname;
    protected String lastname;
    protected String phonenumber;
    protected String email;

    public Token token;

    public User(int userId, String firstname, String lastname,String phonenumber, String email, Token token) {
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.email = email;
        this.token = token;
    }

    public int getUserId() {
        return userId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public Token getToken() {
        return token;
    }
    
    
}

