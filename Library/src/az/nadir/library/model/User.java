/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.nadir.library.model;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class User extends LibraryModel{
    private String name;
    private String surname;
    private Date dob;
    private String identityNumber;
    private String mail;
    private String phone;
    private Integer userActivity;
    private Integer problem;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDob() {
        return dob;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getUserActivity() {
        return userActivity;
    }

    public Integer getProblem() {
        return problem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUserActivity(Integer userActivity) {
        this.userActivity = userActivity;
    }

    public void setProblem(Integer problem) {
        this.problem = problem;
    }

    @Override
    public String toString() {
        return getId()+": "+name +" "+ surname;
    }
     
}
