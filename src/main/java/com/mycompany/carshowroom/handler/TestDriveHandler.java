package com.mycompany.carshowroom.handler;

import com.mycompany.carshowroom.entity.Manager;
import com.mycompany.carshowroom.entity.TestDrive;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */
public interface TestDriveHandler {
    TestDrive addNewTestDrive(TestDrive testDrive);
    TestDrive editTestDrive(int testDriveId, TestDrive testDrive);
    String removeTestDrive(int testDriveId);
    List<TestDrive> getTestDrivesForManager(int managerId);
    List<Manager> getManagersForCar(int carId);
    List<TestDrive> getAllTestDrives();
}
