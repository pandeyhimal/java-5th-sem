package B_basic_io;

import java.util.Scanner;

public class f_area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double pi = 3.14;
        System.out.println("Enter radius:");
        float r = sc.nextFloat();
        float area = (float) (pi * r *r);
        System.out.println("Area of circle = " + area);
        sc.close();
    }
}
