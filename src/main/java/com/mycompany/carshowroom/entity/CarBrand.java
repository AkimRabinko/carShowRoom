package com.mycompany.carshowroom.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author AkimPC
 */
@Entity
public class CarBrand implements Serializable {

    private long carBrandId;

    private String brandOfCar;

    public CarBrand (String brandOfCar) {
        this.brandOfCar = brandOfCar;
    }

    public long getCarBrandId() {
        return carBrandId;
    }

    public String getBrandOfCar() {
        return brandOfCar;
        }
}