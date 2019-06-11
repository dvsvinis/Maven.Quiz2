package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ListUtility {

    private List<Integer> utility= new ArrayList<>();

    public Boolean add(Integer i) {

        return utility.add(i);
    }

    public Integer size() {
        return utility.size();
    }

    public List<Integer> getUnique() {
//        List<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < utility.size(); i++) {
//            if (!temp.contains(utility.get(i))){
//                temp.add(utility.get(i));
//            }
//        }
//        return temp;

        Set<Integer> set = new HashSet<>(utility);
        utility = new ArrayList<>(set);
        return utility;
    }

    public String join() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < utility.size(); i++) {
            temp.append(utility.get(i));
            if (i < utility.size()-1) {
                temp.append(", ");
            }
        }
        return temp.toString();
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        return utility.contains(valueToAdd);
    }
}
