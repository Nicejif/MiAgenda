package com.danie.banner;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        Data dato = new Data();
        System.out.println(""+  dato.readFile("base"));
        Keep.Run();



    }


}
