package com.mycompany.carshowroom.dao.impl;

import com.mycompany.carshowroom.dao.CarBrandDAO;
import com.mycompany.carshowroom.entity.CarBrand;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Repository
@Transactional
public class CarBrandDAOImpl implements CarBrandDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public CarBrand addNewBrand(CarBrand carBrand) {
        sessionFactory.getCurrentSession().save("car_brand", carBrand);
        return carBrand;
    }

    @Override
    public String removeBrand(int brandId) {
        return null;
    }

    @Override
    public List<CarBrand> getAllBrands() {
        return sessionFactory.getCurrentSession().createCriteria(CarBrand.class).list();
    }

    @Override
    public CarBrand getBrandById(int brandId) {
        return (CarBrand) sessionFactory.getCurrentSession().get(CarBrand.class, brandId);
    }
}
