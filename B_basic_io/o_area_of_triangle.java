package B_basic_io;

import java.util.Scanner;

public class o_area_of_triangle {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.println("Enter base:");
        float base = triangle.nextFloat();
        System.out.println("Enter height:");
        float height = triangle.nextFloat();
        System.out.println("The area of triangle is " + 1/2*base*height);
        triangle.close();
    }
}
