package com.mycompany.carshowroom.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author AkimPC
 */
@Entity
@Table(name = "manager")
public class Manager implements Serializable {

    @Id
    @Column(name = "MANAGER_ID", insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int managerId;

    @Column(name = "MANAGER_NAME")
    private String managerName;

    @Column(name = "MANAGER_PHONE")
    private String managerPhone;

    @Column(name = "MANAGER_EMAIL")
    private String managerEmail;

    @Column(name = "MANAGER_PASSPORT_CODE")
    private String pasportCode;

    @Column(name = "MANAGER_BIRTH")
    private Date dateOfBirth;

    @Column(name = "MANAGER_GENDER")
    private String gender;

    public Manager() {}

    public Manager(String managerName, String managerPhone, String managerEmail, String passportCode,
                   Date dateOfBirth, String gender) {
        this.managerName = managerName;
        this.managerPhone = managerPhone;
        this.managerEmail =managerEmail;
        this.pasportCode = passportCode;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public int getManagerId() {
        return managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        managerEmail = managerEmail;
    }

    public String getPasportCode() {
        return pasportCode;
    }

    public void setPasportCode(String pasportCode) {
        this.pasportCode = pasportCode;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
