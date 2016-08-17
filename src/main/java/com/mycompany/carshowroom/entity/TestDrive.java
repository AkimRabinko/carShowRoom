package com.mycompany.carshowroom.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author AkimPC
 */
@Entity
@Table(name = "test_drive")
public class TestDrive implements Serializable {

    @Id
    @Column(name = "TEST_DRIVE_ID", insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int testDriveId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Car testDriveCar;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Manager testDriveManager;

    public TestDrive() {}

    public TestDrive(Car testDriveCar, Manager testDriveManager) {
        this.testDriveCar = testDriveCar;
        this.testDriveManager = testDriveManager;
    }

    public int getTestDriveId() {
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
