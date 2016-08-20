package com.mycompany.carshowroom.dao.impl;

import com.mycompany.carshowroom.dao.BuyerDAO;
import com.mycompany.carshowroom.entity.Buyer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Repository
@Transactional
public class BuyerDAOImpl implements BuyerDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Buyer addNewBuyer(Buyer buyer) {
        sessionFactory.getCurrentSession().save("buyer", buyer);
        return buyer;
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
        return sessionFactory.getCurrentSession().createCriteria(Buyer.class).list();
    }

    @Override
    public Buyer getSingleBuyer(int buyerId) {
        return (Buyer)sessionFactory.getCurrentSession().get(Buyer.class, buyerId);
    }
}
