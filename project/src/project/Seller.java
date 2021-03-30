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
public class Seller extends User2 {
    public Seller(int DBID, String firstname, String lastname, String phonenumber, String email, Token token) {
        super(DBID, firstname, lastname, email, phonenumber, token);
    }
    
}
