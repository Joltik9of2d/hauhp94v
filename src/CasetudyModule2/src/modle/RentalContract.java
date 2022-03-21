package modle;

import java.time.LocalDate;

public interface RentalContract {
    void rentalContract(int numberContract, LocalDate startDay, LocalDate endDay, double deposit, double totalPay);
}
