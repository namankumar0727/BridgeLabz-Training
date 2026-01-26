package com.regex.advanceed;
import java.util.Scanner;

public class IPValidator {

    public static boolean isValidIPv4(String ip) {

        String regex =
        "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}"
      + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

        return ip.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IPv4 address: ");
        String ip = sc.nextLine();

        if (isValidIPv4(ip)) {
            System.out.println("Valid IPv4 address");
        } else {
            System.out.println("Invalid IPv4 address");
        }

        sc.close();
    }
}
