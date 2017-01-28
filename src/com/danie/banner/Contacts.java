package com.danie.banner;


// Our contact list have two values : Name and Phone.


public class Contacts {

    // make him private.


        private String Name;
        private String Phone;


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




    public void print() {
        System.out.println("Name:  "+ getName()+ "\n" + "Phone:  " + getPhone());
    }
}


