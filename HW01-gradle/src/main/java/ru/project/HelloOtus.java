package ru.project;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class HelloOtus {
    public static void main(String[] args) {
        String key = "a-key";
        Multimap<String, String> map = ArrayListMultimap.create();

        map.put(key, "value");
        map.put(key, "another value");

        System.out.println(map.get(key));
    }
}