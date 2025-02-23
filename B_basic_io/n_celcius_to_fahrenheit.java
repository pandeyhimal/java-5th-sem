package B_basic_io;

import java.util.Scanner;

public class n_celcius_to_fahrenheit {
    public static void main(String[] args) {
        Scanner cf = new Scanner(System.in);
        System.out.println("Enter celcius:");
        double celcius = cf.nextDouble();
        double fahrenheit = celcius*9/5+32;
        System.out.println("The conversion of " + celcius + " degree celsius to fahrenheit is " + fahrenheit + " degree fahrenheit.");
        cf.close();
    }
}
