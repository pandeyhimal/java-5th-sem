package B_basic_io;

import java.util.Scanner;

public class j_age_to_day {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = ad.nextInt();
        System.out.println("The days of your age is = " + age*365);
        ad.close();
    }
}
