package com.mycompany.carshowroom.handler;

import com.mycompany.carshowroom.entity.Buyer;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */
public interface BuyerHandler {
    Buyer addNewBuyer(Buyer buyer);
    Buyer editBuyer(int buyerId, Buyer buyer);
    String removeBuyer(int buyerId);
    List<Buyer> getAllBuyers();
    Buyer getSingleBuyer(int buyerId);
}
