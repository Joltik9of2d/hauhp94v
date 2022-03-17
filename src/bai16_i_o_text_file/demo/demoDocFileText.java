package bai16_i_o_text_file.demo;

import java.io.*;

public class demoDocFileText {
    public static void main(String[] args)  {
      try {
          File file = new File("hello.txt");
          FileReader fileReader = new FileReader(file);
          BufferedReader bufferedReader = new BufferedReader(fileReader);
          String line = null;
          while ((line = bufferedReader.readLine())!=null){
              System.out.println(line);
          }
          bufferedReader.close();
      }catch (IOException e){
          e.printStackTrace();
      }
    }
}
