/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Drazic
 */
public class Tokeniser {
    public enum Token { 
        BUYER, SELLER, EMPLOYEE
    }
    
    public static Token getToken(String tokenId){
        /*
        "BUYER" = BUYER
        "SELLER" = SELLER
        "EMPLOYEE" = EMPLOYEES
        */
        if (tokenId.equals("BUYER")) return Token.BUYER;
        if (tokenId.equals("SELLER")) return Token.SELLER;
        if (tokenId.equals("EMPLOYEE")) return Token.EMPLOYEE;
        return null;
    }
    
    public static String getTokenId(Token token){
        /*
        "BUYER" = BUYER
        "SELLER" = SELLER
        "EMPLOYEE" = EMPLOYEES
        */
        if (token == Token.BUYER) return "BUYER";
        if (token == Token.SELLER) return "SELLER";
        if (token == Token.EMPLOYEE) return "EMPLOYEE";
        return "";
    }
}
