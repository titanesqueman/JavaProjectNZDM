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
public class Accomodation {
    protected String address;
    protected int size;
    protected String[] features;
    protected int price;

    public Accomodation(String address, int size, String[] features, int price) {
        this.address = address;
        this.size = size;
        this.features = features;
        this.price = price;
    }
    
}
