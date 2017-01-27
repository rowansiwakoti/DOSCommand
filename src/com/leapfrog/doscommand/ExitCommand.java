package com.leapfrog.doscommand;

public class ExitCommand extends DOSCommand {

    @Override
    public void execute(String[] tokens) {

        System.exit(0);
    }

}
