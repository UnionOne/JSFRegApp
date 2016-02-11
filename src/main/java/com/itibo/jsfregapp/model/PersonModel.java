package com.itibo.jsfregapp.model;

import com.itibo.jsfregapp.enums.Level;
import com.itibo.jsfregapp.enums.Sex;

/**
 * Created by union on 11.02.2016.
 */
public class PersonModel {
    private String firstName;
    private String lastName;
    private Sex sex;
    private String date;
    private String email;
    private Level level;

    public PersonModel() {

    }

    public PersonModel(String firstName, String lastName, Sex sex, String date, String email, Level level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.date = date;
        this.email = email;
        this.level = level;
    }

    public Level[] getLevels() {
        return Level.values();
    }

    public Sex[] getSexes() {
        return Sex.values();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", level=" + level +
                '}';
    }
}
