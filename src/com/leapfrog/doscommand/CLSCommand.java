package com.leapfrog.doscommand;

public class CLSCommand extends DOSCommand {

    @Override
    public void execute(String[] tokens) {

        if (tokens[0].equalsIgnoreCase("cls")) {

            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }

    }
}
