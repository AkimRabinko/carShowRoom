package com.mycompany.carshowroom.controller;

import com.mycompany.carshowroom.entity.Manager;
import com.mycompany.carshowroom.entity.TestDrive;
import com.mycompany.carshowroom.handler.TestDriveHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Controller
@RequestMapping("testdrive")
public class TestDriveController {

    @Autowired
    private TestDriveHandler testDriveHandler;

    @RequestMapping(value = "/addnew" , method = RequestMethod.POST)
    public @ResponseBody TestDrive addNewTestDrive(@RequestBody TestDrive testDrive) {
        return testDriveHandler.addNewTestDrive(testDrive);
    }

    @RequestMapping(value = "/{id}/edit" , method = RequestMethod.PUT)
    public @ResponseBody TestDrive editTestDrive(@PathVariable("id") int testDriveId,
                                                 @RequestBody TestDrive testDrive) {
        return testDriveHandler.editTestDrive(testDriveId,testDrive);
    }

    @RequestMapping(value = "/{id}/remove" , method = RequestMethod.DELETE)
    public @ResponseBody String removeTestDrive(@PathVariable("id") int testDriveId) {
        return testDriveHandler.removeTestDrive(testDriveId);
    }

    @RequestMapping(value = "/{managerId}/getcars" , method = RequestMethod.GET)
    public @ResponseBody List<TestDrive> getAvailableTestDrivesForManager(@PathVariable("managerId") int managerId) {
        return testDriveHandler.getTestDrivesForManager(managerId);
    }

    @RequestMapping(value = "/{carId}/getmanagers" , method = RequestMethod.GET)
    public @ResponseBody List<Manager> getManagersForCar(@PathVariable("carId") int carId) {
        return testDriveHandler.getManagersForCar(carId);
    }

    @RequestMapping(value = "/getall" , method = RequestMethod.GET)
    public @ResponseBody List<TestDrive> getAllTestDrives() {
        return testDriveHandler.getAllTestDrives();
    }
}
