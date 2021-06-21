package com.codewithmash;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calc x=new Calc("15 + 5");
        int s=x.calc();
        System.out.println(s);
        System.out.println(" ");
        Cutter c=new Cutter("192.168.1.15");
        int[] b=c.cutter();
        for(int i:b)
            System.out.println(i);
    }
}