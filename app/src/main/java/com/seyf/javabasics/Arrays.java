package com.seyf.javabasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {

        // Arrays

        String[] myStringArray = new String[3];
        myStringArray[0] = "Seyfullah";
        myStringArray[1] = "Abdullah";
        myStringArray[2] = "Ruhi";
        System.out.println(myStringArray[0]);

        int[] myIntegerArray = new int[3];
        myIntegerArray[0] = 21;
        myIntegerArray[1] = 25;
        myIntegerArray[2] = 50;
        System.out.println(myStringArray[2] + " " + myIntegerArray[2]);

        int[] myNumberArray = {1,2,3,4,5,6,7};
        System.out.println(myNumberArray[3]);

        // Lists

        ArrayList<String> myMusicians = new ArrayList<>();
        myMusicians.add("AnnenMayKantereit");
        myMusicians.add("Sezen Aksu");
        myMusicians.add("Billie Eilish");
        myMusicians.add(0,"Duncan");
        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));
        System.out.println(myMusicians.size());

        // Set "HashSet"

        HashSet<String> mySet = new HashSet<>();
        // mySet.add("James");
        // (List aynı elemandan sadece 1 tane alabilir!)
        mySet.add("James");
        System.out.println(mySet.size());

        // Map "HashMap"

        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("Name", "Jack");
        myHashMap.put("Enstrument", "Guitar");
        System.out.println(myHashMap.get("Name"));
        System.out.println(myHashMap.get("Enstrument"));

        HashMap<String, Integer> mySecMap = new HashMap<>();
        mySecMap.put("run", 100);
        mySecMap.put("Basketball", 200);
        System.out.println(mySecMap.get("run"));
    }
}
