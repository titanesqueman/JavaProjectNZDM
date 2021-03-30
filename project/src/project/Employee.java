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
public class Employee extends Seller {
    public Employee(int DBID, String firstname, String lastname, String email, String phonenumber) {
        super(DBID, firstname, lastname, email, phonenumber, Token.EMPLOYEE);
    }
    
    
}
