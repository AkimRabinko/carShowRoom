package com.mycompany.carshowroom.dao;

import com.mycompany.carshowroom.entity.Manager;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */
public interface ManagerDAO {
    Manager addNewManager(Manager manager);
    Manager editManager(int managerId, Manager manager);
    String removeManager(int managerId);
    List<Manager> getAllManagers();
    Manager getSingleManager(int managerId);
}
