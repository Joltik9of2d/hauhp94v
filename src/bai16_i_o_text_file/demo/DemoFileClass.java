package bai16_i_o_text_file.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileClass {
    public static void main(String[] args) throws IOException {
        File file = new File("filemoi.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());

    }
}
