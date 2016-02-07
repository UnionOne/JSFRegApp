package com.itibo.jsfregapp.gson;

import java.io.*;

import com.google.gson.Gson;

/**
 * Created by union on 06.02.2016.
 */

public class SerializerImpl implements Serializer {
    private Gson gson;
    private BufferedWriter writer;
    private BufferedReader reader;

    public SerializerImpl() {
        gson = new Gson();
    }

    public <T> void Serialize(T obj, String path) throws IOException {
        writer = new BufferedWriter(new FileWriter(path));
        writer.write(gson.toJson(obj));
        writer.close();
    }

    public <T> T Deserialize(String path, Class<T> type) throws IOException {
        reader = new BufferedReader(new FileReader(path));
        T obj = gson.fromJson(reader, type);
        reader.close();

        return obj;
    }
}