package com.mycompany.carshowroom.dao.impl;

import com.mycompany.carshowroom.dao.CarBrandDAO;
import com.mycompany.carshowroom.entity.CarBrand;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Repository
@Transactional
public class CarBrandDAOImpl implements CarBrandDAO {
    @Override
    public CarBrand addNewBrand(CarBrand carBrand) {
        return null;
    }

    @Override
    public String removeBrand(int brandId) {
        return null;
    }
}
