/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import project.Tokeniser.Token;

/**
 *
 * @author nicol
 * @author drazic
 */
public class Seller extends User {
    public Seller(int DBID, String firstname, String lastname, String phonenumber, String email, Token token, java.sql.Connection cnx) {
        super(DBID, firstname, lastname, email, phonenumber, token, cnx);
    }
    
}
