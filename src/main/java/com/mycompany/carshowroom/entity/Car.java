package com.mycompany.carshowroom.entity;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 *
 * @author AkimPC
 */

@Entity
public class Car implements Serializable {

    private long carId;

    private int yearOfRelease;

    private CarBrand carBrand;

    private String modelOfCar;

    private double engineCapacity;

    private int horsePower;

    private String driveOfCar;

    private String transmission;

    private double fuelConsumption;

    public Car(int yearOfRelease, String modelOfCar, double engineCapacity, int horsePower,
                          String driveOfCar, String transmission, double fuelConsumption) {
        this.yearOfRelease = yearOfRelease;
        this.modelOfCar = modelOfCar;
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.driveOfCar = driveOfCar;
        this.transmission = transmission;
        this.fuelConsumption = fuelConsumption;
    }

    public long getCarId() {
        return carId;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
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