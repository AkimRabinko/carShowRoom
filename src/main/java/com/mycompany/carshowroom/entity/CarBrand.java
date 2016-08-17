package com.mycompany.carshowroom.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author AkimPC
 */
@Entity
@Table(name = "car_brand")
public class CarBrand implements Serializable {

    @Id
    @Column(name ="CAR_BRAND_ID", insertable =false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carBrandId;

    @Column(name = "BRAND_NAME")
    private String brandOfCar;

    public CarBrand(){}

    public CarBrand (String brandOfCar) {
        this.brandOfCar = brandOfCar;
    }

    public int getCarBrandId() {
        return carBrandId;
    }

    public String getBrandOfCar() {
        return brandOfCar;
        }
}