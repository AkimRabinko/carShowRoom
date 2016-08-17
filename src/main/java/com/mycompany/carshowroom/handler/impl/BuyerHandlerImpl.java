package com.mycompany.carshowroom.handler.impl;

import com.mycompany.carshowroom.dao.BuyerDAO;
import com.mycompany.carshowroom.entity.Buyer;
import com.mycompany.carshowroom.handler.BuyerHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Service
public class BuyerHandlerImpl implements BuyerHandler {

    @Autowired
    private BuyerDAO buyerDAO;

    @Override
    public Buyer addNewBuyer(Buyer buyer) {
        return buyerDAO.addNewBuyer(buyer);
    }

    @Override
    public Buyer editBuyer(int buyerId, Buyer buyer) {
        return buyerDAO.editBuyer(buyerId,buyer);
    }

    @Override
    public String removeBuyer(int buyerId) {
        return buyerDAO.removeBuyer(buyerId);
    }

    @Override
    public List<Buyer> getAllBuyers() {
        return buyerDAO.getAllBuyers();
    }

    @Override
    public Buyer getSingleBuyer(int buyerId) {
        return buyerDAO.getSingleBuyer(buyerId);
    }
}
