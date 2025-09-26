package com.davinchicoder.data_structures;

import java.util.*;

public class DataStructures {


    public void dataStructures() {
        // List - ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Item 1");
        arrayList.add("Item 2");

        // Set - HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Item 1");
        hashSet.add("Item 2");

        // Queue - PriorityQueue
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer("Item 1");
        priorityQueue.offer("Item 2");
        

        // Map - HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Key1", "Value1");
        hashMap.put("Key2", "Value2");

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("Item 1");
        stack.push("Item 2");

        // Vector
        Vector<String> vector = new Vector<>();
        vector.add("Item 1");
        vector.add("Item 2");
    }

}
