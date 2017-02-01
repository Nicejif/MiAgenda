package com.danie.banner;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Contain {

    private static LinkedList<Contacts> list = new LinkedList<>();
    private static Data dato= new Data();



    public static void keepdata() {



        list.clear();
        LinkedList<String> lista= (LinkedList<String>) dato.readFile(Keys.BASE);


            for (String a : lista) {
                int line= a.indexOf("-");
                String name= a.substring(0, line);
                String phone= a.substring(line+1 ,a.length()-1);

                Contacts nuev= new Contacts(name,phone);
                list.add(nuev);

            }
            try {
                dato.createFile(Keys.BASE, lista);
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public static void printHelp() {

        System.out.println("Si escribes:\n\n" + "l --> Muestra la lista de Contactos de la Agenda\n" + "a --> Añade un Contacto a la Agenda\n"
                + "d --> Borra un Contacto de la Agenda\n" + "q --> Salir del programa\n"
                + "h --> Muestra esta lista de commandos\n");
    }


    public static void printLook(){


        System.out.println("<---" + list.size() + "---->" + "Contactos");
        if (list.size() == 0){
            System.out.println("\n Su agenda se encuentra vacia \n");
        }else{


            for (Contacts contacts : list) {
                System.out.println("(" + Contain.list.indexOf(contacts) + ") Name= " + contacts.getName() + "\t-\t" + " Phone= " + contacts.getPhone() + "\n");

            }
        }


    }



    public static void  add() {

        LinkedList<String> lista= new LinkedList<>();

            //Leo lo que escribo en pantalla como nombre
            System.out.print(" Name = ");
            String n = Prompt.scan();
            //Leo lo que escribo en pantalla como telefono
            System.out.print(" Phone = ");
            String p = Prompt.scan();
           //Creo un nuevo contacto y lo voy añadiendo a mi lista
        Contacts contacto = new Contacts(n, p);

        list.add(contacto);

        for (Contacts co:list) {

            lista.add(co.getName() + " - " + co.getPhone());
        }
        try {
            dato.createFile(Keys.BASE, lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(" New contact added ." + "\n\n");

    }
    public static void cls(){
        for (int i = 0; i < 25; i++) {
            System.out.println(" ");
        }
    }

    public static void delete() {
        LinkedList<String> lista= new LinkedList<>();


        Scanner keyboard = new Scanner(System.in);
        System.out.print(" Position to delete: ");


       try {
           int number = keyboard.nextInt();
           if ((number < 0) || (number >= list.size()) ) {
               System.out.println("Error!");
           } else {
               list.remove(number);
           }
       }catch (InputMismatchException e){
           System.out.println("Noor");
       }

        for (Contacts contacts:list
             ) {
            lista.add(contacts.getName()+ "- " + contacts.getPhone());


        }

        try {
            dato.createFile(Keys.BASE,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
