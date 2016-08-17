package com.mycompany.carshowroom.dao.impl;

import com.mycompany.carshowroom.dao.ManagerDAO;
import com.mycompany.carshowroom.entity.Manager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Repository
@Transactional
public class ManagerDAOImpl implements ManagerDAO {
    @Override
    public Manager addNewManager(Manager manager) {
        return null;
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
        return null;
    }

    @Override
    public Manager getSingleManager(int managerId) {
        return null;
    }
}
