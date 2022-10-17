package com.example.lib;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {
//        List<String> list = new ArrayList();
//        list.add("hello");
//        list.add("bye");
//        list.add("world");
//
//        System.out.println(list.indexOf("bye"));
//        list.add(1,"hi");
//        System.out.println(list.indexOf("bye"));

//        List<String> arrayList = new ArrayList();
//        arrayList.add("hello");
//
//        List<String> linkedList = new LinkedList();
//        linkedList.add("hello");
//
//        System.out.println(arrayList);
//        System.out.println(linkedList);


//        SortedSet sortedSet = new TreeSet();
//        sortedSet.add("banana");
//        sortedSet.add("apple");
//        sortedSet.add("kiwi");
//        sortedSet.add("orange");
//        sortedSet.add("banana");
//
//        System.out.println(sortedSet);

        HashSet hashSet = new HashSet();
        hashSet.add(new Student("Olya"));
        hashSet.add(new Student("Olya"));
        hashSet.add(new Student("Masha"));
        hashSet.add(new Student("Sasha"));
        hashSet.add("");


        System.out.println(hashSet.size());

    }
}
