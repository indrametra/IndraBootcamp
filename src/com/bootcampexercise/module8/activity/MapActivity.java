package com.bootcampexercise.module8.activity;

//Needs to be completed

import java.util.*;


public class MapActivity {

    public static void main(String[] args) {
        Map karte = new HashMap();
        karte.put("m/f", "female");
        karte.put("year", 2010);
        karte.put("temp", 39.2);
        karte.put("illness", "Flu");
        karte.put("condition", "critical");
        //2 - Call print method to print the map passed as its parameter.
        System.out.println("Map condition value initially: " + karte.get("condition"));
        System.out.println("Map temp value initially: " + karte.get("temp"));
        System.out.println("Map illness value initially: " + karte.get("illness"));
        print(karte);
    }

    static void print(Map karte)
    {
          //Keys are maintained as set in map.
        Set keySet = karte.keySet();

        //You can use an iterator to access keys
        System.out.println("0000000000000000000000000000000000000000");
        Iterator ja = keySet.iterator();
        while (ja.hasNext()) {
            String key = (String) ja.next();
            System.out.println("|\t"+key + "\n|\t" + karte.get(key)+"\n|");
            System.out.println("----------------------------------------");
        }

    }
        //3 - Type code to print this map

    }

