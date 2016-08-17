package com.mycompany.carshowroom.controller;

import com.mycompany.carshowroom.entity.Manager;
import com.mycompany.carshowroom.handler.ManagerHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Controller
@RequestMapping("manager")
public class ManagerController {

    @Autowired
    private ManagerHandler managerHandler;

    @RequestMapping(value = "/addmanager" , method = RequestMethod.POST)
    public @ResponseBody Manager addNewManager(@RequestBody Manager manager) {
        return managerHandler.addNewManager(manager);
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.PUT)
    public @ResponseBody Manager editManager(@PathVariable("id") int managerId,
                                             @RequestBody Manager manager) {
        return managerHandler.editManager(managerId,manager);
    }

    @RequestMapping(value = "/{id}/remove", method = RequestMethod.DELETE)
    public @ResponseBody String removeManager(@PathVariable("id") int managerId) {
        return managerHandler.removeManager(managerId);
    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public @ResponseBody
    List<Manager> getAllManagers() {
        return managerHandler.getAllManagers();
    }

    @RequestMapping(value = "/{id}/get", method = RequestMethod.GET)
    public @ResponseBody Manager getSingleManager(@PathVariable("id") int managerId) {
        return managerHandler.getSingleManager(managerId);
    }

}
