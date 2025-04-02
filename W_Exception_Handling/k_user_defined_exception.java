package W_Exception_Handling;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class k_user_defined_exception {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom Exception Occurred");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
