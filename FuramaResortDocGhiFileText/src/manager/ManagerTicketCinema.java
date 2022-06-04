package manager;

import models.Customer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ManagerTicketCinema {
    public static Queue<String> veXemPhimQueue = new ArrayDeque<>();

    public static void buyTicketCinema() {
        if (veXemPhimQueue.size() == 5) {
            System.out.println("Hết vé rồi");
            return;
        }
        System.out.print("Nhập tên khách hàng mua vé: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        veXemPhimQueue.add(name);
        System.out.println("Mua vé thành công");
        System.out.println("Hiện tại đang có " + veXemPhimQueue.size() + " vé, đủ 5 vé thì vào xem phim");
    }

    public static void showTicketCinema() {
        System.out.println("Danh sách vé xem phim, mua trước ngồi trước: ");
        while (!veXemPhimQueue.isEmpty()) {
            System.out.println(veXemPhimQueue.poll());
        }
    }
}
