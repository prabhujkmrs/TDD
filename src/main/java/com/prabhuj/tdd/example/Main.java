package com.prabhuj.tdd.example;

public class Main {

    public static void main(String args[]) {
        SetInterface mySet = new Set();
        //add
        mySet.add(100);
        mySet.add(200);
        mySet.add(300);
        mySet.add("something");
        mySet.add("one");
        mySet.add("two");
        mySet.add("three");
        mySet.add(4);
        mySet.add(5);
        mySet.add(6);
        mySet.add(900);
        mySet.add(700);
        mySet.add(45.6);
        mySet.add(3);
        mySet.add("done");
        //remove
        mySet.remove(100);
        //contains
        mySet.contains(300);
        //size
        System.out.println(mySet.size());

        //check if empty
        System.out.println(mySet.isEmpty());
    }
}
