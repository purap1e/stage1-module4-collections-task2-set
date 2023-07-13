package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer integer : sourceList) {
            if (integer % 2 == 0) {
                int num = integer;
                while (num % 2 == 0) {
                    hashSet.add(num);
                    num = num / 2;
                }
                hashSet.add(num);
            } else {
                hashSet.add(integer);
                hashSet.add(integer * 2);
            }
        }
        return hashSet;
    }
}
