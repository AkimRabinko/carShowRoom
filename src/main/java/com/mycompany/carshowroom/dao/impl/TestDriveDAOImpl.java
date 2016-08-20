package com.mycompany.carshowroom.dao.impl;

import com.mycompany.carshowroom.dao.TestDriveDAO;
import com.mycompany.carshowroom.entity.Manager;
import com.mycompany.carshowroom.entity.TestDrive;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Repository
@Transactional
public class TestDriveDAOImpl implements TestDriveDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public TestDrive addNewTestDrive(TestDrive testDrive) {
        sessionFactory.getCurrentSession().save("test_drive" , testDrive);
        return testDrive;
    }

    @Override
    public TestDrive editTestDrive(int testDriveId, TestDrive testDrive) {
        return null;
    }

    @Override
    public String removeTestDrive(int testDriveId) {
        return null;
    }

    @Override
    public List<TestDrive> getTestDrivesForManager(int managerId) {
        return sessionFactory.getCurrentSession()
                .createQuery("select td.testDriveCar from TestDrive as td where td.testDriveManager.id=:managerId")
                .setParameter("managerId", managerId).list();
    }

    @Override
    public List<Manager> getManagersForCar(int carId) {
        return sessionFactory.getCurrentSession()
                .createQuery("select td.testDriveManager from TestDrive as td where td.testDriveCar.id=:carId")
                .setParameter("carId", carId).list();
    }

    @Override
    public List<TestDrive> getAllTestDrives() {
        return sessionFactory.getCurrentSession().createCriteria(TestDrive.class).list();
    }
}
