package bai16_i_o_text_file.bai_tap_16.copy_file_text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CopyFileSourceToTargetClass {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try{
            fileReader = new FileReader("source.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
