package com.leapfrog.doscommand;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyCommand extends DOSCommand {

    @Override
    public void execute(String[] tokens) {

        if (tokens.length > 2) {
            try {
                FileInputStream fis = new FileInputStream(tokens[1]);
                FileOutputStream fos = new FileOutputStream(tokens[2]);
                int i = 0;
                byte[] data = new byte[1024 * 5];
//               while((i = fis.read()) != -1){
//                   fos.write(i);
//               }
                while ((i = fis.read(data)) != -1) {
                    fos.write(data, 0, i);
                }
                fis.close();
                fos.flush();
                fos.close();
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }

    }

}
