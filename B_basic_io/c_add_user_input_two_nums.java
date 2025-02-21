package B_basic_io;

import java.util.Scanner;

public class c_add_user_input_two_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter another number:");
        int b = sc.nextInt();
        sum = a + b;
        System.out.println("The sum " + a + " and " + b + " = " + sum);
        sc.close();
    }
}
