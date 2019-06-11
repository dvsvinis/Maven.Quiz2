package com.zipcodewilmington.assessment2.part2;


import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int length = array1.length + array2.length;
        Integer[] result = new Integer[length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        List<Integer> temp = new ArrayList<>();
        for (Integer i = index; i < array.length; i++){
            temp.add(array[i]);
        }
        for(Integer i = 0; i < index; i++){
            temp.add(array[i]);
        }
        Integer[] output = new Integer[temp.size()];

        return temp.toArray(output);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;
        int length = array1.length + array2.length;
        Integer[] result = new Integer[length];
        result = merge(array1, array2);

        System.out.println("result : " + Arrays.toString(result));

        for (Integer each : result) {
            if (each == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }


    public Integer mostCommon(Integer[] array) {

        int max = 0, count = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num == max) {
                count++;
            } else if (num > max) {
                max = num;
                count = 1;
            }
        }
        return max;
    }

}

