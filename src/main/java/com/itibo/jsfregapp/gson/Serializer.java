package com.itibo.jsfregapp.gson;

import java.io.IOException;

/**
 * Created by union on 06.02.2016.
 */

public interface Serializer {
    <T> void Serialize(T employee, String path) throws IOException;

    <T> T Deserialize(String path, Class<T> type) throws IOException;
}