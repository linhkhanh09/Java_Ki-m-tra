package fs.apidef.identifyservice.java.BT;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BT2 {
    static void verifyPasswork() {
        String password = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$.!%*?&])[A-Z\\d@$.!%*?&]{10,}$";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập password cần kiểm tra: ");
        String pass = sc.nextLine();
        if (Pattern.matches(password, pass) == true) {
            System.out.println("Password success");
        } else if (pass.length() < 10) {
            System.out.println("Passwork low");
        } else {
            System.out.println("Passwork not strong");
        }
    }
}

