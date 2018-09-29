package com.mobileoid2.celltone.pojo.getmedia;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class GETMEDIATypeConverter {

    private static Gson gson = new Gson();
    @TypeConverter
    public static List<Body> stringToList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<Body>>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String ListToString(List<Body> someObjects) {
        return gson.toJson(someObjects);
    }

}
