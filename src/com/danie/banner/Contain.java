package com.danie.banner;

public class Contain {

    public static void printLook(String Nombre, String Telefono){

    }

    public static String add(String name, String phone) {

        if (name == null) {
            System.out.println(" Name = ");


        } else {
            String n = Prompt.scan();
            name= n;
        }
        if (phone == null) {
            System.out.println(" Phone = ");
        } else {
            String p = Prompt.scan();
            phone= p;


        }
        String result = name + phone;

        return result;
    }
    public static void cls(){
        for (int i = 0; i < 25; i++) {
            System.out.println(" ");
        }
    }
}
