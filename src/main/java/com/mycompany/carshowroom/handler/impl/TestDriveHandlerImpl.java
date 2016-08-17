package com.mycompany.carshowroom.handler.impl;

import com.mycompany.carshowroom.dao.TestDriveDAO;
import com.mycompany.carshowroom.entity.Manager;
import com.mycompany.carshowroom.entity.TestDrive;
import com.mycompany.carshowroom.handler.TestDriveHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Service
public class TestDriveHandlerImpl implements TestDriveHandler {

    @Autowired
    private TestDriveDAO testDriveDAO;

    @Override
    public TestDrive addNewTestDrive(TestDrive testDrive) {
        return testDriveDAO.addNewTestDrive(testDrive);
    }

    @Override
    public TestDrive editTestDrive(int testDriveId, TestDrive testDrive) {
        return testDriveDAO.editTestDrive(testDriveId,testDrive);
    }

    @Override
    public String removeTestDrive(int testDriveId) {
        return testDriveDAO.removeTestDrive(testDriveId);
    }

    @Override
    public List<TestDrive> getTestDrivesForManager(int managerId) {
        return testDriveDAO.getTestDrivesForManager(managerId);
    }

    @Override
    public List<Manager> getManagersForCar(int carId) {
        return testDriveDAO.getManagersForCar(carId);
    }

    @Override
    public List<TestDrive> getAllTestDrives() {
        return testDriveDAO.getAllTestDrives();
    }
}
