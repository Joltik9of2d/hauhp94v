package bai9_automated_testing_tdd.bai_tap_9.fizz_buzz.src;

import java.util.Arrays;

public class FizzBuzzTranslate {
    public static String translate(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (String.valueOf(number).contains("3")) {
            return "Fizz";
        } else if (String.valueOf(number).contains("5")) {
            return "Buzz";
        } else return readNumberToString(number);

    }

    public static String readNumberToString(int number) {
        String strNumber = String.valueOf(number);
        String[] arrayNumber = strNumber.split("");
        String resultString = "";
        if (number >= 0 && number < 100) {
            resultString = converNumberToString(arrayNumber, resultString);
            return resultString;
        }else return "limit number less than 100";
    }
    private static String converNumberToString(String[] arrayNumber, String resultString) {
        for (int i = 0; i < arrayNumber.length; i++) {
            switch (arrayNumber[i]) {
                case "0":
                    arrayNumber[i] = "khong";
                    break;
                case "1":
                    arrayNumber[i] = "mot";
                    break;
                case "2":
                    arrayNumber[i] = "hai";
                    break;
                case "3":
                    arrayNumber[i] = "ba";
                    break;
                case "4":
                    arrayNumber[i] = "bon";
                    break;
                case "5":
                    arrayNumber[i] = "nam";
                    break;
                case "6":
                    arrayNumber[i] = "sau";
                    break;
                case "7":
                    arrayNumber[i] = "bay";
                    break;
                case "8":
                    arrayNumber[i] = "tam";
                    break;
                case "9":
                    arrayNumber[i] = "chin";
                    break;
                default:
                    System.out.println("out of ability");
            }
        }
        for (String a : arrayNumber) {
            resultString += a + " ";
        }
        return resultString;
    }
}

