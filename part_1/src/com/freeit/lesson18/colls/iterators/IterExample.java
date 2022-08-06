package com.freeit.lesson18.colls.iterators;

import java.util.*;

public class IterExample {
    public static void main(String[] args) {

        Set<Integer> intSet = new HashSet<>();
        List<Integer> intList = new ArrayList<>();
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i + 1);
            intSet.add(i + 1);
            intMap.put(i+1, i+1);
        }
        System.out.println(intList);
        System.out.println(intSet);
        System.out.println(intMap);

//        for (int i = intList.size() - 1; i >= 0; i--) {
//            if(intList.get(i) % 2 == 0) {
//                intList.remove(i);
//            }
//        }

//        intList.forEach(x -> {
//            if(x % 2 == 0) {
//                intList.remove(x);
//            }
//        });

//        Iterator<Integer> iterator = intList.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next % 2 == 0) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(intList);

//        Iterator<Integer> iterator = intSet.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next % 2 == 0) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(intSet);

//        Set<Integer> keys = intMap.keySet();
//        Iterator<Integer> keysIterator = keys.iterator();
//        while (keysIterator.hasNext()) {
//            Integer key = keysIterator.next();
//            System.out.print(key);
//            System.out.println(intMap.get(key));
//        }

//        Set<Map.Entry<Integer, Integer>> entries = intMap.entrySet();
//        Iterator<Map.Entry<Integer, Integer>> entriesIterator = entries.iterator();
//        while (entriesIterator.hasNext()) {
//            System.out.println(entriesIterator.next());
//        }
    }
}
