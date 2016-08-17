package com.mycompany.carshowroom.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author AkimPC
 */

@Entity
@Table(name = "car")
public class Car implements Serializable {

    @Id
    @Column(name ="CAR_ID", insertable =false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Buyer buyer;

    @Column(name = "RELEASE_YEAR")
    private int yearOfRelease;

    @Column(name = "CAR_BRAND")
    private String carBrand;

    @Column(name = "CAR_MODEL")
    private String modelOfCar;

    @Column(name = "ENGINE_CAPACITY")
    private double engineCapacity;

    @Column(name = "HORSE_POWER")
    private int horsePower;

    @Column(name = "CAR_DRIVE")
    private String driveOfCar;

    @Column(name = "TRANSMISSION")
    private String transmission;

    @Column(name = "FUEL_CONSUMPTION" )
    private double fuelConsumption;

    public  Car() {}

    public Car(int yearOfRelease, String carBrand, String modelOfCar, double engineCapacity, int horsePower,
                          String driveOfCar, String transmission, double fuelConsumption) {
        this.yearOfRelease = yearOfRelease;
        this.carBrand = carBrand;
        this.modelOfCar = modelOfCar;
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.driveOfCar = driveOfCar;
        this.transmission = transmission;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCarId() {
        return carId;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModelOfCar() {
        return modelOfCar;
    }

    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getDriveOfCar() {
        return driveOfCar;
    }

    public void setDriveOfCar(String driveOfCar) {
        this.driveOfCar = driveOfCar;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}