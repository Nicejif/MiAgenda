package com.danie.banner;


// Our contact list have two values : Name and Phone.


import java.util.LinkedList;



public class Contacts {

    // make him private.


    private String Name;
    private String Phone;
    private LinkedList<Contacts> contact = new LinkedList<>();


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }


    public Contacts() {
    }

    public Contacts(String name) {
        this.Name = name;
    }

    public Contacts(String name, String phone) {
        this.Name = name;
        this.Phone = phone;
    }


    public LinkedList<Contacts> getContacts() {
        return contact;
    }
}


