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
public class Buyer extends User{
    public Buyer(int DBID, String firstname, String lastname, String emailAddress, String phonenumber, java.sql.Connection cnx) {
        super(DBID, firstname, lastname, emailAddress, phonenumber, Token.BUYER, cnx);
    }
}
