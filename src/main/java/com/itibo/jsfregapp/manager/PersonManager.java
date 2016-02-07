package com.itibo.jsfregapp.manager;

/*import com.itibo.jsfregapp.gson.Serializer;
import com.itibo.jsfregapp.gson.SerializerImpl;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;*/

/**
 * Created by union on 06.02.2016.
 */

public class PersonManager {
    /*private List<Person> persons;
    private Serializer serializer;
    private String dbPath;

    public PersonManager(String dbPath) {
        this(new ArrayList<Person>(), new SerializerImpl(), dbPath);
    }

    public PersonManager(List<Person> persons, Serializer serializer, String dbPath) {
        this.persons = persons;
        this.serializer = serializer;
        this.dbPath = dbPath;
    }

    public boolean readBase() throws IOException {
        boolean isReaded = false;

        if (new File(dbPath).exists()) {
            persons = Arrays.asList(serializer.Deserialize(dbPath, Person[].class));
            isReaded = true;
        } else {
            isReaded = false;
        }
        return isReaded;
    }

    public void updateOrCreateBase() throws IOException {
        serializer.Serialize(persons.toArray(), dbPath);
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public Serializer getSerializer() {
        return serializer;
    }

    public void setSerializer(Serializer serializer) {
        this.serializer = serializer;
    }

    public String getDbPath() {
        return dbPath;
    }

    public void setDbPath(String dbPath) {
        this.dbPath = dbPath;
    }

    @Override
    public String toString() {
        return "PersonManager{" +
                "persons=" + persons +
                ", serializer=" + serializer +
                ", dbPath='" + dbPath + '\'' +
                '}';
    }*/
}
