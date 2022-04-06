package bai18_string_regex.bai_tap_18.validate_ten_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static final String NAME_CLASS_REGEX = "^[ACP]\\d{4}[GHIKLM]$";

    public NameClass() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NAME_CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
