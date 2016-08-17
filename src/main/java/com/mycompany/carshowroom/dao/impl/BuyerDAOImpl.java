package com.mycompany.carshowroom.dao.impl;

import com.mycompany.carshowroom.dao.BuyerDAO;
import com.mycompany.carshowroom.entity.Buyer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Repository
@Transactional
public class BuyerDAOImpl implements BuyerDAO {
    @Override
    public Buyer addNewBuyer(Buyer buyer) {
        return null;
    }

    @Override
    public Buyer editBuyer(int buyerId, Buyer buyer) {
        return null;
    }

    @Override
    public String removeBuyer(int buyerId) {
        return null;
    }

    @Override
    public List<Buyer> getAllBuyers() {
        return null;
    }

    @Override
    public Buyer getSingleBuyer(int buyerId) {
        return null;
    }
}
