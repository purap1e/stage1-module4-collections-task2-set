package com.epam.mjc.collections.set;

import java.util.*;
import java.util.stream.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        sourceList = sourceList.stream()
                .map(num -> (int) Math.pow(num,2))
                .collect(Collectors.toList());
        NavigableSet<Integer> navigableSet = new TreeSet<>(sourceList);
        return navigableSet.subSet(lowerBound, true, upperBound, true);
    }
}
