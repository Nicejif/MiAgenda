package com.danie.banner;


import java.io.File;
import java.io.IOException;

public class Keep {






    public static void Run() throws IOException {
        try {
            File file = new File(Keys.BASE);

            if (file.createNewFile()){
                System.out.println("Creating " + Keys.BASE);
            }else{
                Contain.keepdata();
                System.out.println("Loaded data from " + Keys.BASE);
            }
        } catch (Exception e) {
            System.out.println("Error creating new file");
            System.out.println(e);
        }



        boolean end= false;

        while (!end){
            Prompt.init();
            Prompt.print();

            String prompt= Prompt.scan();
            Command com= CommandParser.parse(prompt);

            switch (com){

                case ADD:

                    Contain.add();
                    break;
                case DELETE:
                    Contain.delete();
                    break;
                case QUIT:
                    end=true;
                    break;
                case LOOK:

                    Contain.printLook();
                    break;
                case HELP:
                    Contain.printHelp();
                    break;
                case CLS:
                    Contain.cls();
                    break;
                case UNKNOWN:
                    break;
            }
        }

    }


}