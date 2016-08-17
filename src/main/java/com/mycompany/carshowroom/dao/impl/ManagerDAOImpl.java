package com.mycompany.carshowroom.dao.impl;

import com.mycompany.carshowroom.dao.ManagerDAO;
import com.mycompany.carshowroom.entity.Manager;
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
public class ManagerDAOImpl implements ManagerDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Manager addNewManager(Manager manager) {
        sessionFactory.getCurrentSession().save("manager", manager);
        return manager;
    }

    @Override
    public Manager editManager(int managerId, Manager manager) {
        return null;
    }

    @Override
    public String removeManager(int managerId) {
        return null;
    }

    @Override
    public List<Manager> getAllManagers() {
        return sessionFactory.getCurrentSession().createCriteria(Manager.class).list();
    }

    @Override
    public Manager getSingleManager(int managerId) {
        return (Manager)sessionFactory.getCurrentSession().get(Manager.class, managerId);
    }
}
