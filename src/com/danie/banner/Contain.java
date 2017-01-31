package com.danie.banner;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Contain {

    private static List<Contacts> list = new LinkedList<>();
    private static List<String> lista= new LinkedList<>();



    public static void keepdata() {


        Data dato = new Data();



            for (Contacts contacto : list) {
                String n = Contain.list.indexOf(contacto) + ") Name= " + contacto.getName() + "\t-\t" + " Phone= " + contacto.getPhone() + "\n";

                lista.add(n);
            }
            try {
                dato.createFile("base", lista);
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

        if (list == null){
            System.out.println("\n Su agenda se encuentra vacia \n");
        }else{

            for (Contacts contacts : list) {
                System.out.println("(" + Contain.list.indexOf(contacts) + ") Name= " + contacts.getName() + "\t-\t" + " Phone= " + contacts.getPhone() + "\n");

            }
        }


    }



    public static void  add() {



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

        keepdata();




    }
    public static void cls(){
        for (int i = 0; i < 25; i++) {
            System.out.println(" ");
        }
    }

    public static void delete() {
        System.out.print(" Position to delete: ");
        int number= Integer.parseInt(Prompt.scan());

        for (Contacts contact:list){
            int nu=Contain.list.indexOf(contact);

            nu= number;
            System.out.print("Ha eliminado el contacto" +  contact.toString());
            list.remove(number);
        }


    }


}
