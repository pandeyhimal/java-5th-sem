package B_basic_io;

import java.util.Scanner;

public class k_sum_diff_pro_div {
    public static void main(String[] args) {
        Scanner sdpd = new Scanner(System.in);
        System.out.println("Enter any two number:");
        float a = sdpd.nextFloat();
        float b = sdpd.nextFloat();
        System.out.println("The addition of " + a + " and " + b + " = " + (a+b));
        System.out.println("The difference of " + a + " and " + b + " = " + (a-b));
        System.out.println("The product of " + a + " and " + b + " = " + a*b);
        System.out.println("The division of " + a + " and " + b + " = " + a/b);
        sdpd.close();
    }
}
