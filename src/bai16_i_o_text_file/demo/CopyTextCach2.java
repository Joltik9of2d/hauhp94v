package bai16_i_o_text_file.demo;

import java.io.*;

public class CopyTextCach2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("source.txt");
            fileWriter = new FileWriter("target.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null) {
                System.out.println(line);
                fileWriter.write(line+ "\n");
            }
            bufferedReader.close();
            System.out.println("đã copy xong");
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Lỗi rồi");
        }finally {
           fileReader.close();
           fileWriter.close();
        }

    }
}
