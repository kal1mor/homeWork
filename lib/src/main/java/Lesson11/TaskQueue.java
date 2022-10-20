package Lesson11;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class TaskQueue {
    public static void main(String[] args) {
//        Queue queue = new PriorityQueue();
//        queue.offer("Hello");
//        queue.offer("Bye1");
//        queue.offer("World");
//
//        System.out.println(queue);
//        queue.poll();
//        queue.poll();
//        System.out.println(queue);


        ArrayDeque<String> arrayDeque = new ArrayDeque();
        arrayDeque.add("ios developer");
        arrayDeque.push("flutter developer");
        arrayDeque.addFirst("android developer");
        arrayDeque.addLast("python developer");

        System.out.println(arrayDeque);

        ArrayList arrayList = new ArrayList();
        arrayList.addAll(arrayDeque);
        System.out.println(arrayList.get(3));
        Set set = new TreeSet();
        set.addAll(arrayList);
        System.out.println(set);

    }
}
