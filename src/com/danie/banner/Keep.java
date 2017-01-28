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
                    Contain.add(contacto.getName(),contacto.getPhone());

                    break;
                case DELETE:

                    break;
                case QUIT:
                    end=true;
                    break;
                case LOOK:

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