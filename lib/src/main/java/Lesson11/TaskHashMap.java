package Lesson11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TaskHashMap {
    public static void main(String[] args) {

//        TreeMap hashMap = new TreeMap();
//        hashMap.put("A", "C");
//        hashMap.put("D", "A");
//        hashMap.put("B", "D");
//        hashMap.put("C", "B");
//
//
//        System.out.println(hashMap);

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Sasha");
        arrayList.add("Olya");
        arrayList.add("Sasha");
        arrayList.add("Dima");
        arrayList.add("Masha");



        Collections.sort(arrayList, Comparator.<String>naturalOrder());
        System.out.println(arrayList);
        Collections.sort(arrayList, Comparator.<String>reverseOrder());
        System.out.println(arrayList);


//        System.out.println(arrayList);
//
//        Collections.sort(arrayList, new Comparator<Person>() {
//            @Override
//            public int compare(Person person, Person t1) {
//                return Integer.valueOf(person.getAge()).compareTo(Integer.valueOf(t1.getAge()));
//            }
//        });
//
//
//        for (Person person : arrayList){
//            System.out.println(person.getAge());
//        }





////        Iterator iterator = arrayList.iterator();
////        while (iterator.hasNext()){
////            System.out.print(iterator.next());
////        }
//
////        int index = arrayList.indexOf("two");
//        arrayList.remove("two");
//        System.out.print(arrayList);

    }
}

class Person{
    private String name;
//    private int age;

    Person(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

//    public int getAge() {
//        return age;
//    }
}

