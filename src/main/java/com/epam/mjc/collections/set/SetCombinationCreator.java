package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> finalThirdSet = thirdSet;
        Set<String> set1 = firstSet.stream().filter(x -> secondSet.contains(x) && !finalThirdSet.contains(x)).collect(Collectors.toSet());
        thirdSet = thirdSet.stream().filter(x -> !firstSet.contains(x) && !secondSet.contains(x)).collect(Collectors.toSet());
        set1.addAll(thirdSet);
        return set1;
    }
}
