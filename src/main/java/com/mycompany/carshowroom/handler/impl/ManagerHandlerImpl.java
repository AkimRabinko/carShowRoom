package com.mycompany.carshowroom.handler.impl;

import com.mycompany.carshowroom.dao.ManagerDAO;
import com.mycompany.carshowroom.entity.Manager;
import com.mycompany.carshowroom.handler.ManagerHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Service
public class ManagerHandlerImpl implements ManagerHandler {

    @Autowired
    private ManagerDAO managerDAO;

    @Override
    public Manager addNewManager(Manager manager) {
        return managerDAO.addNewManager(manager);
    }

    @Override
    public Manager editManager(int managerId, Manager manager) {
        return managerDAO.editManager(managerId,manager);
    }

    @Override
    public String removeManager(int managerId) {
        return managerDAO.removeManager(managerId);
    }

    @Override
    public List<Manager> getAllManagers() {
        return managerDAO.getAllManagers();
    }

    @Override
    public Manager getSingleManager(int managerId) {
        return managerDAO.getSingleManager(managerId);
    }
}
