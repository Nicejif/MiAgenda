package com.danie.banner;

import java.util.LinkedList;

public class Contain {

    private static LinkedList<Contacts> contact = new LinkedList<>();
    private static Contacts lista;


    public static LinkedList<Contacts> getContact() {
        return contact;
    }

    public static void setContact(LinkedList<Contacts> contact) {
        Contain.contact = contact;
    }

    public static Contacts getLista() {
        return lista;
    }

    public static void setLista(Contacts lista) {
        Contain.lista = lista;
    }

    public static void printLook(){

        LinkedList<Contacts> contact=lista.getContacts();

        if (contact == null){
            System.out.println("No tienes ningun contacto");
        }else{
            System.out.println("\n\n"+ contact);
        }

    }



    public static void  add() {

            System.out.print(" Name = ");

            String n = Prompt.scan();

            System.out.print(" Phone = ");

            String p = Prompt.scan();

        Contacts contacto = new Contacts(n,p);

        System.out.println(" New contact added ." + "\n\n");

        contact.add(contacto);
    }
    public static void cls(){
        for (int i = 0; i < 25; i++) {
            System.out.println(" ");
        }
    }

    public static void delete() {
        System.out.print(" Name= ");
        String name= Prompt.scan();
        contact.remove(name);
    }


}
