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
public class Employees extends Seller {
    protected int employeeID;

    public Employees(int employeeID, int sellerID, String name, String emailAddress, String password) {
        super(sellerID, name, emailAddress, password);
        this.employeeID = employeeID;
    }
    
    
}
