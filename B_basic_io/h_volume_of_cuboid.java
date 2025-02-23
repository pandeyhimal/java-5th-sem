package B_basic_io;

import java.util.Scanner;

public class h_volume_of_cuboid {
    public static void main(String[] args) {
        Scanner cuboid = new Scanner(System.in);
        System.out.println("Enter length:");
        float length = cuboid.nextFloat();
        System.out.println("Enter breadth:");
        float breadth = cuboid.nextFloat();
        System.out.println("Enter height:");
        float height = cuboid.nextFloat();
        System.out.println("The volume of cuboid is " + length*breadth*height);
        cuboid.close();
    }
}
