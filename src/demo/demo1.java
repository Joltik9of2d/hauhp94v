package demo;

import javax.sql.rowset.Joinable;
import java.time.LocalTime;
import java.util.StringJoiner;

public class demo1 {
    static public int X = 2;

    public static void main(String[] args) {
//        demo1 o1 = new demo1();
//        demo1 o2 = new demo1();
//        o2.X = 5;
//        System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, demo1.X);
//        LocalTime now = LocalTime.now();
//        System.out.println(now);
        String gender = "hUyNh pHuOc hAu";
        gender = gender.toLowerCase();
        String[] strings = gender.split("");
        strings[0] = strings[0].toUpperCase();
        String gender1 = "";
        for(String s:strings){
            gender1+=s;
        }
        System.out.println(gender1);


    }
}
