package com.leapfrog.doscommand;

import java.io.File;

public class MDCommand extends DOSCommand {

    @Override
    public void execute(String[] tokens) {

        if (tokens.length > 1) {

            File file = new File(tokens[1]);
            if (!file.isDirectory()) {
                file.mkdir();
                System.out.println(tokens[1] + " Directory Created Successfully!");
            } else {
                System.out.println("A subdirectory or file " + tokens[1] + " already exists.");
            }

        } else {
            System.out.println("Not Enough Parameters!");
        }
    }

}
