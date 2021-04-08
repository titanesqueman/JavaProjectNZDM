/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Drazic
 */
public class Offer {
    int offerId;
    int propertyId;
    int buyerId;
    int offerPrice;
    String status;

    public Offer(int offerId, int propertyId, int buyerId, int offerPrice, String status) {
        this.offerId = offerId;
        this.propertyId = propertyId;
        this.buyerId = buyerId;
        this.offerPrice = offerPrice;
        this.status = status;
    }

    public int getOfferId() {
        return offerId;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public int getOfferPrice() {
        return offerPrice;
    }

    public String getStatus() {
        return status;
    }
    
    public static Offer getOfferFromRS(ResultSet rs){
        try {
            return new Offer(rs.getInt("offerId"), rs.getInt("propertyId"),rs.getInt("buyerId"),rs.getInt("offerPrice"),rs.getString("status"));
        } catch (SQLException ex) {
            Logger.getLogger(Offer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
