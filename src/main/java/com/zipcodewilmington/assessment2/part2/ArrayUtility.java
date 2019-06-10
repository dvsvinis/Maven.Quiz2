package com.zipcodewilmington.assessment2.part2;


import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int length = array1.length + array2.length;
        Integer[] result = new Integer[length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;
        int length = array1.length + array2.length;
        Integer[] result = new Integer[length];
        result = merge(array1, array2);

        System.out.println("result : " + Arrays.toString(result));

        for (Integer each : result){
            if(each == valueToEvaluate){
                count++;
            }
        }
          return count;
    }



    public Integer mostCommon(Integer[] array) {
        return null;
    }

}
