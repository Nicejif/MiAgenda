package com.danie.banner;


public class Keep {





    public static void Run() {
        Contacts contacto = new Contacts();


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
                case CLS:
                    Contain.cls();
                    break;
                case UNKNOWN:
                    break;
            }
        }

    }


}