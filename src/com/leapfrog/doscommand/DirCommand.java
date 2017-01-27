package com.leapfrog.doscommand;

import java.io.File;

public class DirCommand extends DOSCommand {

    @Override
    public void execute(String[] tokens) {
        File file = null;
        if (tokens.length > 1) {
            file = new File(tokens[1]);

        } else {
            file = new File(".");

        }
        int count = 0;

        for (File f : file.listFiles()) {
            System.out.println(f.getName());
            count++;
        }
        System.out.println("Number of files: " + count);
    }

}
