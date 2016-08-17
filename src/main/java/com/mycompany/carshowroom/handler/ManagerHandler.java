package com.mycompany.carshowroom.handler;

import com.mycompany.carshowroom.entity.Manager;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */
public interface ManagerHandler {
    Manager addNewManager(Manager manager);
    Manager editManager(int managerId, Manager manager);
    String removeManager(int managerId);
    List<Manager> getAllManagers();
    Manager getSingleManager(int managerId);
}
