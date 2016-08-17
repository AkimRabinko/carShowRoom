package com.mycompany.carshowroom.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author AkimPC
 */
@Entity
public class TestDrive implements Serializable {

    private Long testDriveId;

     private Car testDriveCar;

    private Manager testDriveManager;

    public TestDrive(Car testDriveCar, Manager testDriveManager) {
        this.testDriveCar = testDriveCar;
        this.testDriveManager = testDriveManager;
    }

    public Long getTestDriveId() {
        return testDriveId;
    }

    public Car getTestDriveCar() {
        return testDriveCar;
    }

    public void setTestDriveCar(Car testDriveCar) {
        this.testDriveCar = testDriveCar;
    }

    public Manager getTestDriveManager() {
        return testDriveManager;
    }

    public void setTestDriveManager(Manager testDriveManager) {
        this.testDriveManager = testDriveManager;
    }
}
