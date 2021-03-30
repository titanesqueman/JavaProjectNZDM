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
public class User2 {
    protected int BDID;
    protected String firstname;
    protected String lastname;
    protected String phonenumber;
    protected String email;

    public Token token;

    public User2(int BDID, String firstname, String lastname,String phonenumber, String email, Token token) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.email = email;
        this.token = token;
    }
}

