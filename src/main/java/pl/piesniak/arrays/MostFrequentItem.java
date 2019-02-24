package pl.piesniak.arrays;

import java.util.*;

public class MostFrequentItem {

    public static Integer mostFreqent(int[] givenArray) {
        Integer maxCount = -1;
        Integer maxItem = 0;

        if ((givenArray == null) || (givenArray.length == 0)) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : givenArray) {
            if (map.containsKey(i)) {
                Integer newValue = map.get(i) + 1;
                map.put(i, newValue);
            } else {
                map.put(i, 1);
            }
            if(map.get(i) > maxCount){
                maxCount = map.get(i);
                maxItem = i;
            }
        }

        return maxItem;
    }
}