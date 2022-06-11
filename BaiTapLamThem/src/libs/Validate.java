package libs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String REGEX_MA_KHACH_HANG_VIET_NAM = "^KHVN-\\d{5}$";
    public static final String REGEX_MA_KHACH_HANG_NUOC_NGOAI = "^KHNN-\\d{5}$";

    public static boolean validateMaKHVN(String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(REGEX_MA_KHACH_HANG_VIET_NAM);
        return matcher.matches();
    }
    public static boolean validateMaKHNN(String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(REGEX_MA_KHACH_HANG_NUOC_NGOAI);
        return matcher.matches();
    }
}
