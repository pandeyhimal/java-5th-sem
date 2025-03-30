package W_Exception_Handling;

public class e_exception_handling {
    public static void main(String[] args) {
        int a = 23, b = 0, result;
        try {
            result = a / b;
            System.out.println("The result is = " + result);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide a non zero number by a zero:");
        } finally {
            System.out.println("Be careful while dividing any non zero number by a zero:");
        }
    }
}
