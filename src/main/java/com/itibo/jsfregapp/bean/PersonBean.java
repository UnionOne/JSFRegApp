package com.itibo.jsfregapp.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by union on 06.02.2016.
 */

@ManagedBean
@SessionScoped
public class PersonBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private Sex sex;
    private String date;
    private String email;
    private Level level;

    public Level[] getLevels() {
        return Level.values();
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
}