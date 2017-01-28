package com.danie.banner;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //Create a new List

        Contacts maria = new Contacts();
        maria.setName("Maria");
        maria.setPhone("6598459221");
       

        LinkedList<Contacts> contactos = new LinkedList<>();
        final Contacts juan = new Contacts("Juan ","123901723");

        contactos.add(juan);


    }
}
