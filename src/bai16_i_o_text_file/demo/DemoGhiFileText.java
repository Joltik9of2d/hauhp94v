package bai16_i_o_text_file.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DemoGhiFileText {
    public static void main(String[] args)  {
        FileWriter writer = null;
      try {
          writer = new FileWriter("hello.txt");
          writer.write("xin chao huynh phuoc hau 123");
          writer.close();
          System.out.println("đã ghi file xong");
      }catch (IOException e){
          e.printStackTrace();
      }
    }


}
