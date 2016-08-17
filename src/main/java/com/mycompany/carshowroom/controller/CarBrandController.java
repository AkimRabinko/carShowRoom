package com.mycompany.carshowroom.controller;

import com.mycompany.carshowroom.entity.CarBrand;
import com.mycompany.carshowroom.handler.CarBrandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Controller
@RequestMapping("carbrand")
public class CarBrandController {

    @Autowired
    private CarBrandHandler carBrandHandler;

    @RequestMapping(value = "/addbrand", method = RequestMethod.POST)
    public @ResponseBody CarBrand addNewBrand(@RequestBody CarBrand carBrand) {
        return carBrandHandler.addNewBrand(carBrand);
    }

    @RequestMapping(value = "/{id}/removebrand", method = RequestMethod.POST)
    public @ResponseBody String removeBrand(@PathVariable("id") int brandId) {
        return carBrandHandler.removeBrand(brandId);
    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public @ResponseBody List<CarBrand> getAllBrands() {
        return carBrandHandler.getAllBrands();
    }

    @RequestMapping(value = "/{id}/get", method = RequestMethod.GET)
    public @ResponseBody CarBrand getBrandById(@PathVariable("id") int brandId) {
        return carBrandHandler.getBrandById(brandId);
    }

}
