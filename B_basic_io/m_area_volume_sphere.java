package B_basic_io;

import java.util.Scanner;

public class m_area_volume_sphere {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner sphere = new Scanner(System.in);
        System.out.println("Enter radius:");
        float radius =  sphere.nextFloat();
        double area = 4*pi*Math.pow(2,radius);
        double volume = 4/3*pi*Math.pow(3,radius);
        System.out.println("The area of sphere = " + area);
        System.out.println("The volume of sphere = " + volume);
        sphere.close();
    }
}
