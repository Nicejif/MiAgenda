package com.danie.banner;


import java.util.Scanner;

public class Prompt {

    public static void init(){
        System.out.print("Esta es tu agenda personalizada."+ "\n\n");
    }

    // this text show ever you need.
    public static void print(){
        System.out.print("Hola digame que necesita : " + "\n\n");
    }

    public static String scan(){
        Scanner scanner= new Scanner(System.in);
        return scanner.nextLine();
    }
}
