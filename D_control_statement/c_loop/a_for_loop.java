package D_control_statement.c_loop;

import java.util.Scanner;

public class a_for_loop {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Even numbers from 1 to n:");
        System.out.println("Enter any number:");
        int n = ab.nextInt();
        ab.close();

        System.out.println("Even numbers from 0 to " + n + " are:");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
