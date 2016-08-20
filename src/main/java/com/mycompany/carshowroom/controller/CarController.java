package com.mycompany.carshowroom.controller;

import com.mycompany.carshowroom.entity.Car;
import com.mycompany.carshowroom.handler.CarHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Controller
@RequestMapping("car")
public class CarController {

    @Autowired
    private CarHandler carHandler;

    @RequestMapping(value = "/addnew", method = RequestMethod.POST)
    public @ResponseBody Car addNewCar(@RequestBody Car car) {
        return carHandler.addNewCar(car);
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.PUT)
    public @ResponseBody Car editCar(@PathVariable("id") int carId,
                                     @RequestBody Car car) {
        return carHandler.editCar(carId, car);
    }

    @RequestMapping(value = "/{id}/remove", method = RequestMethod.DELETE)
    public @ResponseBody String removeCar(@PathVariable("id") int carId) {
        return carHandler.removeCar(carId);
    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public @ResponseBody List<Car> getAllCars() {
        return carHandler.getAllCars();
    }

    @RequestMapping(value = "/{id}/get", method = RequestMethod.GET)
    public @ResponseBody Car getSingleCar(@PathVariable("id") int carId) {
        return carHandler.getSingleCar(carId);
    }

}
