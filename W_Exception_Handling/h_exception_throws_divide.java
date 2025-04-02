package W_Exception_Handling;

import java.util.Scanner;

public class h_exception_throws_divide {
    public int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        h_exception_throws_divide obj = new h_exception_throws_divide();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividened:");
        int dividened = sc.nextInt();
        System.out.println("Enter divisor:");
        int divisor = sc.nextInt();
        sc.close();

        try {
            System.out.println("The quotient = " + obj.divide(dividened, divisor));
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide a non-zero number by zero:");
        }
    }
}
