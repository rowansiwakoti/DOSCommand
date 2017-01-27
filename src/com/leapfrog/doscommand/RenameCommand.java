package com.leapfrog.doscommand;

import java.io.File;

public class RenameCommand extends DOSCommand {

    @Override
    public void execute(String[] tokens) {

        if (tokens.length > 2) {
            File file = new File(tokens[1]);
            file.renameTo(new File(tokens[2]));
            System.out.println(tokens[1] + " Renamed to " + tokens[2]);
        } else {
            System.out.println("Not Enough Parameters!");
        }
    }

}
