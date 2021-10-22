package bai9_automated_testing_tdd.bai_tap_9.tinh_ngay_tiep_theo.src;

import java.time.LocalDate;
import java.util.Locale;

public class NextDayCalculator {
    public static LocalDate timNgayHomSau(LocalDate date){
return date.plusDays(1);
    }
}
