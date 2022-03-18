package bai16_i_o_text_file.demo;

import bai16_i_o_text_file.bai_tap_16.read_file_csv.Country;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoDocFileCSV {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("country.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                Country country = new Country(Integer.parseInt(splitData[0]), splitData[1], splitData[2]);
                System.out.println(country.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
