package com.danie.banner;


import java.util.Scanner;

public class Prompt {

    public static void init(){
        System.out.println("Esta es tu agenda personalizada.");
    }

    // this text show ever you need.
    public static void print(){
        System.out.println("Hola digame que necesita : ");
    }

    public static String scan(){
        Scanner scanner= new Scanner(System.in);
        return scanner.nextLine();
    }
}
