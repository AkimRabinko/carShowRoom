package com.mycompany.carshowroom.handler.impl;

import com.mycompany.carshowroom.dao.CarDAO;
import com.mycompany.carshowroom.entity.Car;
import com.mycompany.carshowroom.handler.CarHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Service
public class CarHandlerImpl implements CarHandler {

    @Autowired
    private CarDAO carDAO;

    @Override
    public Car addNewCar(Car car) {
        return carDAO.addNewCar(car);
    }

    @Override
    public Car editCar(int carId, Car car) {
        return carDAO.editCar(carId,car);
    }

    @Override
    public String removeCar(int carId) {
        return carDAO.removeCar(carId);
    }

    @Override
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }

    @Override
    public Car getSingleCar(int carId) {
        return carDAO.getSingleCar(carId);
    }
}
