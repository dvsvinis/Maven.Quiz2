package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    private String path;
    private String controller;
    private Map<String, String> routerMap = new LinkedHashMap<String, String>();

    public void add(String path, String controller) {
        routerMap.put(path, controller);
    }

    public Integer size() {
        return routerMap.size();
    }

    public String getController(String path) {
        return routerMap.get(path);
    }

    public void update(String path, String studentController) {
        routerMap.replace(path, studentController);
    }

    public void remove(String path) {
        routerMap.remove(path);
    }


    public String toString() {
        String output = "";
           for (String each : routerMap.keySet()) {
              output += each;
              output += getController(each);
              output += "\n";
        }
           return output;
    }

}
