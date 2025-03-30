package G_constructors;

import java.util.Scanner;

public class c_parameterized_constructor {
    public c_parameterized_constructor(int a, int b) {
        System.out.println("The sum of two values = " + (a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for first variable:");
        int x = sc.nextInt();
        System.out.println("Enter the value for second variable:");
        int y = sc.nextInt();
        sc.close();
        new c_parameterized_constructor(x,y);
    }
}
