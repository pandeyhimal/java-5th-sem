package B_basic_io;

import java.util.Scanner;

public class g_area_of_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of a square:");
        int length = sc.nextInt();
        int area = length * length;
        System.out.println("The area of the square is = " + area);
        sc.close();
    }
}
