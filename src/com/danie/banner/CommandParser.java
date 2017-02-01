package com.danie.banner;

public class CommandParser {

    public static Command parse(String text){

        if (text.equalsIgnoreCase("add") || text.equalsIgnoreCase("a")){
            return Command.ADD;
        }if (text.equalsIgnoreCase("help") || text.equalsIgnoreCase("h")){
            return Command.HELP;
        }
        if (text.equalsIgnoreCase("delete") || text.equalsIgnoreCase("d")){
            return Command.DELETE;
        }
        if (text.equalsIgnoreCase("quit") || text.equalsIgnoreCase("q")){
            return Command.QUIT;
        }
        if (text.equalsIgnoreCase("look") || text.equalsIgnoreCase("l")){
            return Command.LOOK;
        }
        if (text.equalsIgnoreCase("cls")){
            return Command.CLS;
        }


        return Command.UNKNOWN;
    }
}
