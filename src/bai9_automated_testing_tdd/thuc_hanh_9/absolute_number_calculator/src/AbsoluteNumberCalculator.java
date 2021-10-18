package bai9_automated_testing_tdd.thuc_hanh_9.absolute_number_calculator.src;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number){
        if(number < 0)
            return  -number;
        return number;
    }
}