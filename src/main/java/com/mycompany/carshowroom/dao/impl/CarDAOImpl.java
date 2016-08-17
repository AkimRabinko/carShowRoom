package com.mycompany.carshowroom.dao.impl;

import com.mycompany.carshowroom.dao.CarDAO;
import com.mycompany.carshowroom.entity.Car;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Repository
@Transactional
public class CarDAOImpl implements CarDAO {
    @Override
    public Car addNewCar(Car car) {
        return null;
    }

    @Override
    public Car editCar(int carId, Car car) {
        return null;
    }

    @Override
    public String removeCar(int carId) {
        return null;
    }

    @Override
    public List<Car> getAllCars() {
        return null;
    }

    @Override
    public Car getSingleCar(int carId) {
        return null;
    }
}
