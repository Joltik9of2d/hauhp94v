package bai16_i_o_text_file.bai_tap_16.copy_file_text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileSourceToTarget {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("source.txt");
            fileOutputStream= new FileOutputStream("target.txt");
            int ch;
            while ((ch = fileInputStream.read()) != -1) {
                System.out.print((char) ch);
                fileOutputStream.write(ch);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
