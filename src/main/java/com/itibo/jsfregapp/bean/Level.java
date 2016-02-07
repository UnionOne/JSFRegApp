package com.itibo.jsfregapp.bean;

/**
 * Created by union on 06.02.2016.
 */
public enum Level {
    Basic, Medium, Premium;

    public static Level findLevel (String str) {
        for (Level level : Level.values()) {
            if (str.equals(level.name())) {
                return level;
            }
        }
        return null;
    }
}