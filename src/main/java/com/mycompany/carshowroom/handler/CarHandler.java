package com.mycompany.carshowroom.handler;

import com.mycompany.carshowroom.entity.Car;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */
public interface CarHandler {
    Car addNewCar(Car car);
    Car editCar(int carId, Car car);
    String removeCar(int carId);
    List<Car> getAllCars();
    Car getSingleCar(int carId);
}
