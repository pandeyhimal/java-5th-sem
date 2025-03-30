package G_constructors;

import java.util.Scanner;

public class h_user_input_parametrized {
    h_user_input_parametrized(int a, int b) {
        int x = a;
        int y = b;
        System.out.println("The sum of two values = " + (x + y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value:");
        int a = sc.nextInt();
        System.out.println("Enter second value:");
        int b = sc.nextInt();
        new h_user_input_parametrized(a, b);
        sc.close();
    }
}