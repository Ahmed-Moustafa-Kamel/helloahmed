package com.codewithmash;

public class Calc {
    String s;
    public Calc(String s) {

        this.s = s;
    }
    public int calc(){
        String[] list=s.split(" ");
        if(list.length == 3){
            String a=list[1];
            if(a.equals("+")){
                return Integer.parseInt(list[0]) + Integer.parseInt(list[2]);
            }
        }

        return 0;
    }



}
