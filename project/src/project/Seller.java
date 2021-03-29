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
public class Seller extends user {
    protected int sellerID;

    public Seller(int sellerID, String name, String emailAddress, String password) {
        super(name, emailAddress, password, "seller");
        this.sellerID = sellerID;
    }
    
}
