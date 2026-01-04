package com.hashmapandhashfunc.customhashmap;
public class CustomHashMapApp {
    public static void main(String[] args) {

        MyHashMap<Integer, String> map = new MyHashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(12, "Orange"); // collision example

        System.out.println(map.get(1));   // Apple
        System.out.println(map.get(12));  // Orange

        map.remove(2);
        System.out.println(map.get(2));   // null
    }
}
