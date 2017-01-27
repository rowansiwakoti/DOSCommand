package com.leapfrog.doscommand;

import java.io.File;

public class RDCommand extends DOSCommand {

    @Override
    public void execute(String[] tokens) {

        if (tokens.length > 1) {

            File file = new File(tokens[1]);

            if (file.exists()) {
                file.delete();
                System.out.println(tokens[1] + " Directory Deleted Successfully!");
            } else {
                System.out.println("The system cannot find the file specified.");
            }

        } else {
            System.out.println("Not Enough Parameters!");
        }

    }

}
