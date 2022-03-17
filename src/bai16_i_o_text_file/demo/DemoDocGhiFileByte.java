package bai16_i_o_text_file.demo;

import java.io.*;

public class DemoDocGhiFileByte {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
            fileInputStream = new FileInputStream("source.txt");
            fileOutputStream = new FileOutputStream("target.txt");
            int ch;
            while ((ch = fileInputStream.read())!=-1){
                System.out.print(ch);
                fileOutputStream.write(ch);
                break;
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Lỗi rồi");
        }finally {
            fileInputStream.close();
            fileOutputStream.close();
        }

    }
}
