package com.itibo.jsfregapp.bean;

/**
 * Created by union on 06.02.2016.
 */
public enum Sex {
    Male, Female;

    public static Sex findSex(String str) {
        for (Sex sex : Sex.values()) {
            if (str.equals(sex.name())) {
                return sex;
            }
        }
        return null;
    }
}