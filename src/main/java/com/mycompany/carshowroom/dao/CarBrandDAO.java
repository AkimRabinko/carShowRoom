package com.mycompany.carshowroom.dao;

import com.mycompany.carshowroom.entity.CarBrand;

/**
 * Created by AkimPC on 15.08.2016.
 */
public interface CarBrandDAO {
    CarBrand addNewBrand(CarBrand carBrand);
    String removeBrand(int brandId);
}
