package com.loong.io.sample.字节流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamBufferedOutputStreamCopyDemo {
    public static void main(String[] args ) {

        String bin = File.separator + "home" + File.separator + "siu" +
                File.separator + "work" + File.separator + "一个人生活.mp3";

        String copy = File.separator + "home" + File.separator + "siu" +
                File.separator + "life" + File.separator + "一个人生活.mp3";

        FileInputStream i = null;
        FileOutputStream o = null;
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;

        try {
            i = new FileInputStream(bin);
            o = new FileOutputStream(copy);
            bi = new BufferedInputStream(i);
            bo = new BufferedOutputStream(o);

            byte[] buf = new byte[1024];
            int temp = 0;
            while((temp = bi.read(buf)) != -1) {
                bo.write(buf,0,temp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bi != null) {
                try {
                    bi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bo != null) {
                try {
                    bo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
