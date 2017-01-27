package com.leapfrog.doscommand;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DownloadCommand extends DOSCommand {

    @Override
    public void execute(String[] tokens) {

        if (tokens.length > 2) {
            try {
                URL url = new URL(tokens[1]);

                //shorthand for:openConnection().getInputStream()
                InputStream io = url.openStream();

                //URLConnection conn = url.openConnection();
                //InputStream io1 = conn.getInputStream();
                FileOutputStream fos = new FileOutputStream(tokens[2]);

                int i = 0;
                byte[] data = new byte[1024 * 10];

                while ((i = io.read(data)) != -1) {
                    fos.write(data, 0, i);
                }

                fos.flush();
                fos.close();

            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }

    }

}
