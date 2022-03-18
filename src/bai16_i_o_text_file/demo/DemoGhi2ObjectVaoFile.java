package bai16_i_o_text_file.demo;

import bai15_xu_ly_ngoai_le_va_debug.bai_tap_15.illegal_triangle_exception.IllegalTriangleException;
import bai15_xu_ly_ngoai_le_va_debug.bai_tap_15.illegal_triangle_exception.Triangle;
import bai16_i_o_text_file.bai_tap_16.read_file_csv.Country;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoGhi2ObjectVaoFile {
    public static void main(String[] args)  {
        FileWriter fileWriter = null;
        try{
           fileWriter = new FileWriter("demoGhi2Object.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            Country vn = new Country(12,"vn","vietnam");
            bufferedWriter.write(vn.toString());
            bufferedWriter.newLine();
            Triangle triangle = new Triangle(3,4,5);
            bufferedWriter.write(triangle.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("đã ghi xong");
        }catch (IOException | IllegalTriangleException e){
            e.printStackTrace();
        }
    }
}
