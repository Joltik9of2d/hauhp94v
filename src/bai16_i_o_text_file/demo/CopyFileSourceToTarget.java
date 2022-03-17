package bai16_i_o_text_file.demo;

import java.io.BufferedInputStream;
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
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] data = new byte[1024];
            int length = bufferedInputStream.read(data);
            System.out.println("Số lượng kí tự đọc được = "+ length);
            String result = new String(data,0,length);
            System.out.println(result);
            bufferedInputStream.close();
            System.out.println("đã copy xong");
        }
        catch (Exception e) {
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
