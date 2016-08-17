package com.mycompany.carshowroom.handler;

import com.mycompany.carshowroom.entity.CarBrand;

/**
 * Created by AkimPC on 15.08.2016.
 */
public interface CarBrandHandler {
    CarBrand addNewBrand(CarBrand carBrand);
    String removeBrand(int brandId);
}
