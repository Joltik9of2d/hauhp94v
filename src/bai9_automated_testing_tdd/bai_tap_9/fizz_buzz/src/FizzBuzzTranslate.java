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
            return readNumber(number);
        } else return String.valueOf(number);

    }

    public static String readNumber(int number) {
        String strNumber = String.valueOf(number);
        String[] arrayNumber = strNumber.split("");
        if (number >= 0 && number < 100) {
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
        }
    return Arrays.toString(arrayNumber);
    }
}

