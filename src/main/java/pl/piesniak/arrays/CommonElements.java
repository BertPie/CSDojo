package pl.piesniak.arrays;

import java.util.*;

public class CommonElements {
    public static Integer[] commonElements(int[] array1, int[] array2) {
        List<Integer> list = new ArrayList<>();
        Integer i = 0;
        Integer j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                list.add(array1[i]);
                i++;
                j++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                i++;
            }
        }

        Integer[] array = new Integer[list.size()];
        return list.toArray(array);
    }
}