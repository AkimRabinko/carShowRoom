package com.mycompany.carshowroom.handler;

import com.mycompany.carshowroom.entity.CarBrand;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */
public interface CarBrandHandler {
    CarBrand addNewBrand(CarBrand carBrand);
    String removeBrand(int brandId);
    List<CarBrand> getAllBrands();
    CarBrand getBrandById(int brandId);
}
