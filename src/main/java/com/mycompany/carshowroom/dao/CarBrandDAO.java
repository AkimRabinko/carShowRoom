package com.mycompany.carshowroom.dao;

import com.mycompany.carshowroom.entity.CarBrand;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */
public interface CarBrandDAO {
    CarBrand addNewBrand(CarBrand carBrand);
    String removeBrand(int brandId);
    List<CarBrand> getAllBrands();
    CarBrand getBrandById(int brandId);
}
