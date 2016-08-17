package com.mycompany.carshowroom.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author AkimPC
 */
@Entity
public class Manager implements Serializable {

    private long managerId;

    private String managerName;

    private String phone;

    private String Email;

    private String pasportCode;

    private String dateOfBirth;

    private String gender;

    public Manager(String managerName, String phone, String Email, String passportCode, String dateOfBirth, String gender) {
        this.managerName = managerName;
        this.phone = phone;
        this.Email =Email;
        this.pasportCode = passportCode;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public long getManagerId() {
        return managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPasportCode() {
        return pasportCode;
    }

    public void setPasportCode(String pasportCode) {
        this.pasportCode = pasportCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
