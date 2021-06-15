package fs.apidef.identifyservice.java.BT;

import java.util.Scanner;

public class BT3 {
    static void verifyThang() {
            int n;
            Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập số nguyên dương n: ");
                n = scanner.nextInt();
            if (n == 2) {
                System.out.println("Tháng " + n + " có 28 hoặc 29 ngày !");
            } else if (n == 4 || n == 6 || n == 9 || n == 11) {
                System.out.println("Tháng " + n + " có 30 ngày !");
            } else if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
                System.out.println("Tháng " + n + " có 31 ngày !");
            } else {
                System.out.println("Số bạn nhập không hợp lệ !");
            }
    }
}