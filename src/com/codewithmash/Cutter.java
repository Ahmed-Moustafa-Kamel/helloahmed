package com.codewithmash;

public class Cutter {
    private String s;
    public Cutter(String s) {
        this.s = s;
    }

    public int[] cutter(){
        String[] list=s.split("\\.");
        int[] r=new int[list.length];
        int a=0;
        for (String i : list) {
            r[a]=Integer.parseInt(i);
             a++;
        }
        return  r;

    }
}
