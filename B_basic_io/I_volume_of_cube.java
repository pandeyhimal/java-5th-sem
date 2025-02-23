package B_basic_io;

import java.util.Scanner;

public class I_volume_of_cube {
    public static void main(String[] args) {
        Scanner cube= new Scanner(System.in);
        System.out.println("Enter length:");
        float length = cube.nextFloat();
        double volume =  Math.pow(3, length);
        System.out.println("The volume of cube is " + volume);
        cube.close();
    }
}
