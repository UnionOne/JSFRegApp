package com.itibo.jsfregapp.bean;

import com.itibo.jsfregapp.model.PersonModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by union on 06.02.2016.
 */

@ManagedBean(name = "personBean")
@SessionScoped
public class PersonBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<PersonModel> persons;
    private PersonModel personModel;

    public PersonBean() {
        persons = new ArrayList<>();
        personModel = new PersonModel();
    }

    public PersonModel getPersonModel() {
        return personModel;
    }

    public void setPersonModel(PersonModel personModel) {
        this.personModel = personModel;
    }

    public void addUser() {
        this.persons.add(this.personModel);
    }

    public String getPersons() {
        return persons.toString();
    }

    @Override
    public String toString() {
        String result = "";
        for (PersonModel personModel : persons) {
            result += personModel;
            result += "\n\n";
        }
        return result;
    }
}