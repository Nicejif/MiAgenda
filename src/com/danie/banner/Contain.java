package com.danie.banner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Contain {

    private static List<Contacts> list = new ArrayList<>();



    public static void printHelp() {





        System.out.println("Si escribes:\n\n" + "l --> Muestra la lista de Contactos de la Agenda\n" + "a --> Añade un Contacto a la Agenda\n"
                + "d --> Borra un Contacto de la Agenda\n" + "q --> Salir del programa\n"
                + "h --> Muestra esta lista de commandos\n");
    }


    public static void printLook(){
        if (list == null){
            System.out.println("\n Su agenda se encuentra vacia \n");
        }else {

            for (Contacts contacts : list) {
                System.out.println("(" + Contain.list.indexOf(contacts) + ")\t Name= " + contacts.getName() + "\n\t" + " Phone= " + contacts.getPhone());

            }
        }

        Data dato = new Data();
        System.out.println(dato.readFile("base"));
    }



    public static void  add() throws IOException {

        Data dato = new Data();

            //Leo lo que escribo en pantalla como nombre
            System.out.print(" Name = ");
            String n = Prompt.scan();
            //Leo lo que escribo en pantalla como telefono
            System.out.print(" Phone = ");
            String p = Prompt.scan();
           //Creo un nuevo contacto y lo voy añadiendo a mi lista
        Contacts contacto = new Contacts(n, p);

        System.out.println(" New contact added ." + "\n\n");


        list.add(contacto);

        dato.createFile("base", list);



    }
    public static void cls(){
        for (int i = 0; i < 25; i++) {
            System.out.println(" ");
        }
    }

    public static void delete() {
        System.out.print(" Position to delete: ");
        String number= Prompt.scan();

        for (Contacts contact:list){
            Contain.list.equals(number);

            System.out.print("Ha eliminado el contacto" +  contact.toString());
            list.remove(contact);
        }


    }


}
