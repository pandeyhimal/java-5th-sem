package D_control_statement.b_switch_statement;

import java.util.Scanner;

public class b_calculation_using_operator {
    public static void main(String[] args) {
        Scanner opr = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = opr.nextInt();
        System.out.println("Enter second number:");
        int y = opr.nextInt();
        System.out.println("Enter operator such as '+', '-', '*', '/', '%' for operation:");
        char operator = opr.next().charAt(0);
        opr.close();
        switch (operator) {
            case '+':
                System.out.println("The sum between num 1 and num 2 is " + (x + y));
                break;
            case '-':
                System.out.println("The difference between num 1 and num 2 is " + (x - y));
                break;
            case '*':
                System.out.println("The product of num 1 and num 2 is " + (x * y));
                break;
            case '/':
                System.out.println("The division between num 1 and num 2 is " + (x / y));
                break;
            case '%':
                System.out.println("The remainder between num 1 and num 2 is " + (x % y));
                break;
            default:
                System.out.println("Invalid operator:");
                break;
        }
    }
}
