package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return (array.length % 2 == 0);
    }

    public Integer[] range(int start, int stop) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = start; i <= stop; i++){
            result.add(i);
        }
        Integer[] output = new Integer[result.size()];

      //  Integer[] output = result.toArray(new Integer[0]);  this is the shortcut
        return result.toArray(output);
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return ((array[0] + array[1]));
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return ((array[array.length-1] * array[array.length-2]));
    }
}
