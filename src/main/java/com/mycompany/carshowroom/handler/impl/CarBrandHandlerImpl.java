package com.mycompany.carshowroom.handler.impl;

import com.mycompany.carshowroom.dao.CarBrandDAO;
import com.mycompany.carshowroom.entity.CarBrand;
import com.mycompany.carshowroom.handler.CarBrandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Service
public class CarBrandHandlerImpl implements CarBrandHandler {

    @Autowired
    private CarBrandDAO carBrandDAO;

    @Override
    public CarBrand addNewBrand(CarBrand carBrand) {
        return carBrandDAO.addNewBrand(carBrand);
    }

    @Override
    public String removeBrand(int brandId) {
        return carBrandDAO.removeBrand(brandId);
    }
}
