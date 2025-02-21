package B_basic_io;

import java.util.Scanner;

public class e_simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal:");
        double p = sc.nextInt();
        System.out.println("Enter time:");
        double t = sc.nextInt();
        System.out.println("Enter rate of interest:");
        double r = sc.nextDouble();
        double si = (p*t*r)/100;
        System.out.println("Simple Interest = " + si);
        sc.close();
    }
}
