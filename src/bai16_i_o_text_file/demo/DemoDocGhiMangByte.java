package bai16_i_o_text_file.demo;

import java.io.*;

public class DemoDocGhiMangByte {
    public static void main(String[] args)  {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("source.txt");
            fileOutputStream = new FileOutputStream("target.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] data = new byte[1024];
            int length = bufferedInputStream.read(data);
            System.out.println("length = "+ length);
//            String result = new String(data,0,length);
            String result = new String(data);
            System.out.println(result);
            bufferedInputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fileInputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
