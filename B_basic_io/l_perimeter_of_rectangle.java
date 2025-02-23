package B_basic_io;

import java.util.Scanner;

public class l_perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner perimeter = new Scanner(System.in);
        System.out.println("Enter length and breadth:");
        float length = perimeter.nextFloat();
        float breadth = perimeter.nextFloat();
        System.out.println(" The perimeter of rectangle is = " + 2*(length+breadth));
        perimeter.close();
    }
}
