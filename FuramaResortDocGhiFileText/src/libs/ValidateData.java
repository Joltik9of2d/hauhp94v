package libs;

import exception.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {
    public static final String SERVICE_ID_REGEX = "^SV(VL|RO|HO)-\\d{4}$";
    public static final String SERVICE_NAME_REGEX = "^[A-Z][a-z]*(\\s[a-z]*)*$";
    public static final String SERVICE_USABLE_POOL_REGEX = "^([4-9][0-9]\\.?\\d*)|(3[1-9]\\.?\\d*)|(30\\.[1-9])|([1-9]\\d{2,}\\.?\\d*)$";
    public static final String SERVICE_MAX_OF_PEOPLE_REGEX = "^[1-9]|[1]\\d|[0][1-9]$";
    public static final String SERVICE_ACCOMPANIED_REGEX = "^(massage)|(karaoke)|(food)|(drink)|(car)$";
    public static final String SERVICE_NUMBER_OF_FLOORS_REGEX = "^[1-9]\\d|[0][1-9]+$";
    public static final String SERVICE_RENTAL_TYPE_REGEX = "^(Gio)|(Ngay)|(Thang)|(Nam)$";
    public static final String SERVICE_ROOM_STANDARD_REGEX = "^[1-5]\\*$";
    public static final String CUSTOMER_BIRTHDAY_REGEX = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)\\d\\d$";
    public static final String CUSTOMER_GENDER_REGEX = "^(Male)|(Female)|(Unknow)$";
    public static final String CUSTOMER_EMAIL_REGEX = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*$";
    public static final String CUSTOMER_TYPE_CUSTOMER_REGEX = "^(Diamond)|(Platinium)|(Gold)|(Silver)|(Member)$";
    public static final String CUSTOMER_ID_REGEX = "^CU-\\d{4}$";
    public static final String CUSTOMER_NAME_REGEX = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    public static final String CUSTOMER_ID_CARD_REGEX = "^\\d{3}(\\s\\d{3}){2}$";

    public static boolean validateIdCard(String regex) throws IdCardException {
        Matcher matcher = Pattern.compile(CUSTOMER_ID_CARD_REGEX).matcher(regex);
        if(!matcher.matches()) throw new IdCardException("Id card không hợp lệ, nhập lại");
        return matcher.matches();
    }


    public static boolean validateNameCustomer(String regex) throws NameException {
        Matcher matcher = Pattern.compile(CUSTOMER_NAME_REGEX).matcher(regex);
        if(!matcher.matches()) throw new NameException("Tên không hợp lệ, nhập lại");
        return matcher.matches();
    }

    public static boolean validateIdService(String regex) {
        Matcher matcher = Pattern.compile(SERVICE_ID_REGEX).matcher(regex);
        return matcher.matches();
    }

    public static boolean validateIdCustomer(String regex) {
        Matcher matcher = Pattern.compile(CUSTOMER_ID_REGEX).matcher(regex);
        return matcher.matches();
    }

    public static boolean validateUsablePool(String regex) {
        Matcher matcher = Pattern.compile(SERVICE_USABLE_POOL_REGEX).matcher(regex);
        return matcher.matches();
    }

    public static boolean validateMaxOfPeople(String regex) {
        Matcher matcher = Pattern.compile(SERVICE_MAX_OF_PEOPLE_REGEX).matcher(regex);
        return matcher.matches();
    }

    public static boolean validateAccompanied(String regex) {
        Matcher matcher = Pattern.compile(SERVICE_ACCOMPANIED_REGEX).matcher(regex);
        return matcher.matches();
    }

    public static boolean validateNumberOfFloors(String regex) {
        Matcher matcher = Pattern.compile(SERVICE_NUMBER_OF_FLOORS_REGEX).matcher(regex);
        return matcher.matches();
    }

    public static boolean validateGender(String regex) throws GenderException {
        regex = standardizedGender(regex);
        Matcher matcher = Pattern.compile(CUSTOMER_GENDER_REGEX).matcher(regex);
        if(!matcher.matches()) throw new GenderException("Gender không hợp lệ, nhập lại.");
        return matcher.matches();
    }

    public static boolean validateRentalType(String regex) {
        Matcher matcher = Pattern.compile(SERVICE_RENTAL_TYPE_REGEX).matcher(regex);
        return matcher.matches();
    }

    public static boolean validateRoomStandard(String regex) {
        Matcher matcher = Pattern.compile(SERVICE_ROOM_STANDARD_REGEX).matcher(regex);
        return matcher.matches();
    }

    public static boolean validateEmail(String regex) throws EmailException {
        Matcher matcher = Pattern.compile(CUSTOMER_EMAIL_REGEX).matcher(regex);
        if(!matcher.matches()) throw new EmailException("Email này không hợp lệ, nhập lại: ");
        return matcher.matches();
    }

    public static boolean validateTypeCustomer(String regex) {
        Matcher matcher = Pattern.compile(CUSTOMER_TYPE_CUSTOMER_REGEX).matcher(regex);
        return matcher.matches();
    }

    public static boolean validateNameService(String regex) {
        Matcher matcher = Pattern.compile(SERVICE_NAME_REGEX).matcher(regex);
        return matcher.matches();
    }

    public static boolean validateBirthday(String regex) throws BirthdayException {
        Matcher matcher = Pattern.compile(CUSTOMER_BIRTHDAY_REGEX).matcher(regex);
        if (!matcher.matches()) {
            throw new BirthdayException("Ngày sinh không hợp lệ.");
        }
        LocalDate birthday = stringBirthdayToLocadateBirthday(regex);
        if(!birthday.isBefore(LocalDate.now().minusYears(18))) throw new BirthdayException("Chưa đủ 18 tuổi");
        return birthday.isBefore(LocalDate.now().minusYears(18));
    }

    public static LocalDate stringBirthdayToLocadateBirthday(String stringBirthday) {
        String[] arrayBirthday = stringBirthday.split("/");
        int day = Integer.parseInt(arrayBirthday[0]);
        int month = Integer.parseInt(arrayBirthday[1]);
        int year = Integer.parseInt(arrayBirthday[2]);
        return LocalDate.of(year, month, day);

    }

    public static String standardizedGender(String gender) {
        gender = gender.toLowerCase();
        String[] string = gender.split("");
        string[0] = string[0].toUpperCase();
        String stringResult = "";
        for (String s : string) {
            stringResult += s;
        }
        return stringResult;
    }

}
