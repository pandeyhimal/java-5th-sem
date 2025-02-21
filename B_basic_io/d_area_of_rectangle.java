package B_basic_io;

import java.util.Scanner;

public class d_area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        int area = l*b;
        System.out.println("The area of rectangle = " + area);
        sc.close();
    }
}
