package com.zipcodewilmington.assessment2.part1;


public class WuTangConcatenator {

    private Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;

    }


    //Multiples of 3 are considered Wu numbers.
    public Boolean isWu() {
       return (input %3 == 0);

    }

//    //Multiples of 5 are considered Tang numbers.
    public Boolean isTang()
    {
      return (input %5 == 0);
    }

//    //Multiples of 3 and 5 are considered WuTang numbers.
    public Boolean isWuTang() {

        return ((input %3 == 0) && (input %5 == 0));
    }
}
