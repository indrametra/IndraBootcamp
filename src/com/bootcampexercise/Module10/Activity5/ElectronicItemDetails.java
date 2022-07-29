package com.bootcampexercise.Module10.Activity5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ElectronicItemDetails {
    public static void main(String[] args) {
        Map items = new HashMap();
        items.put("TV",152.30);
        items.put("Refrigerator", 256.32);
        items.put("Washing Machine", 201.01);
        items.put("Laptop",456.23);
        //2 - Call print method to print the map passed as its parameter.
        System.out.println("Price of TV is " + items.get("TV")+" EUR");
        System.out.println("Price of refrigerator is " + items.get("Refrigerator")+" EUR");
        System.out.println("Price of washing machine is " + items.get("Washing Machine")+" EUR");
        System.out.println("Price of laptop is " + items.get("Laptop")+" EUR");
        print(items);
    }

    static void print(Map items)
    {
        //Keys are maintained as set in map.
        Set keySet = items.keySet();

        //You can use an iterator to access keys
        System.out.println("0000000000000000000000000000000000000000");
        Iterator ja = keySet.iterator();
        while (ja.hasNext()) {
            String key = (String) ja.next();
            System.out.println("|\t"+key + "\n|\t" + items.get(key)+"\n|");
            System.out.println("----------------------------------------");
        }

    }
}

