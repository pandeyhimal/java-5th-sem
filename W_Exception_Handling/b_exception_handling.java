package W_Exception_Handling;

public class b_exception_handling {
    public static void main(String[] args) {
        int a = 12, b = 0, result;

        try {
            result = a / b;
            System.out.println("The result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Can't divide a non-zero number by a zero:");
        }
    }
}
