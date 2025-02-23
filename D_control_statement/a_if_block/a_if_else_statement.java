package D_control_statement.a_if_block;

import java.util.Scanner;

public class a_if_else_statement {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter any numbers:");
        int x = ab.nextInt();
        if(x%2==0)
        {
            System.out.println("Even numbers:" + x);
        }
        else
        {
            System.out.println("Odd numbers:" + x);
        }
        ab.close();
    }
}
