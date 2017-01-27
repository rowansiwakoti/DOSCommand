package com.leapfrog.doscommand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.print(">");

                String line = br.readLine();

                String[] tokens = line.split(" ");

                DOSCommand cmd = DOSCommandFactory.getCommand(tokens[0]);
                if (cmd != null) {
                    cmd.execute(tokens);

                } else {
                    System.out.println("Invalid Command");
                }

            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }

    }
}
