package com.mycompany.carshowroom.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author AkimPC
 */
@Entity
public class Buyer implements Serializable {

    private long buyerId;

    private String buyerName;

    private String buyerPhone;

    private String buyerEmail;

    private String yearOfBuyerBirth;

    private String passportCode;

    private Car car;

    private String dateOfSell;

    public Buyer (String buyerName, String buyerPhone, String buyerEmail, String yearOfBuyerBirth,
                  String passportCode, String dateOfSell ) {
        this.buyerName = buyerName;
        this.buyerPhone = buyerPhone;
        this.buyerEmail = buyerEmail;
        this.yearOfBuyerBirth = yearOfBuyerBirth;
        this.passportCode = passportCode;
        this.dateOfSell = dateOfSell;
    }

    public long getBuyerId() {
        return buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public String getYearOfBuyerBirth() {
        return yearOfBuyerBirth;
    }

    public void setYearOfBuyerBirth(String yearOfBuyerBirth) {
        this.yearOfBuyerBirth = yearOfBuyerBirth;
    }

    public String getPassportCode() {
        return passportCode;
    }

    public void setPassportCode(String passportCode) {
        this.passportCode = passportCode;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getDateOfSell() {
        return dateOfSell;
    }

    public void setDateOfSell(String dateOfSell) {
        this.dateOfSell = dateOfSell;
    }
}