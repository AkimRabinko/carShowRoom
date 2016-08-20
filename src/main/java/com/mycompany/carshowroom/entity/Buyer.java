package com.mycompany.carshowroom.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author AkimPC
 */
@Entity
@Table(name = "buyer")
public class Buyer implements Serializable {

    @Id
    @Column(name ="BUYER_ID", insertable =false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int buyerId;

    @Column(name = "BUYER_NAME")
    private String buyerName;

    @Column(name = "BUYER_PHONE")
    private String buyerPhone;

    @Column(name = "BUYER_EMAIL")
    private String buyerEmail;

    @Column(name = "BUYER_BIRTH")
    private Date yearOfBuyerBirth;

    @Column(name = "BUYER_PASSPORT_CODE")
    private String passportCode;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Car> car;

    @Column(name = "SELL_DATE")
    private Date dateOfSell;

    public  Buyer() {}

    public Buyer (String buyerName, String buyerPhone, String buyerEmail, Date yearOfBuyerBirth,
                  String passportCode, Date dateOfSell ) {
        this.buyerName = buyerName;
        this.buyerPhone = buyerPhone;
        this.buyerEmail = buyerEmail;
        this.passportCode = passportCode;
        this.yearOfBuyerBirth = yearOfBuyerBirth;
        this.dateOfSell = dateOfSell;
    }

    public int getBuyerId() {
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

    public Date getYearOfBuyerBirth() {
        return yearOfBuyerBirth;
    }

    public void setYearOfBuyerBirth(Date yearOfBuyerBirth) {
        this.yearOfBuyerBirth = yearOfBuyerBirth;
    }

    public String getPassportCode() {
        return passportCode;
    }

    public void setPassportCode(String passportCode) {
        this.passportCode = passportCode;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public Date getDateOfSell() {
        return dateOfSell;
    }

    public void setDateOfSell(Date dateOfSell) {
        this.dateOfSell = dateOfSell;
    }
}