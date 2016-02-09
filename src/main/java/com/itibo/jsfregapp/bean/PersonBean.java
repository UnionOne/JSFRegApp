package com.itibo.jsfregapp.bean;

import com.itibo.jsfregapp.manager.PersonManager;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

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

    public PersonBean() {

    }

    public PersonBean(String firstName, String lastName, Sex sex, String date, String email, Level level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.date = date;
        this.email = email;
        this.level = level;
    }

    public void addUser(PersonBean personBean) throws IOException {
        List<PersonBean> persons = new ArrayList<>();

        persons.add(personBean);

        final String dbPath = "example.json";
        PersonManager manager = new PersonManager(dbPath);

        if (!manager.readBase()) {
            manager.setPersons(persons);
            manager.setDbPath(dbPath);
        }

        System.out.println(persons.toString());
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

}