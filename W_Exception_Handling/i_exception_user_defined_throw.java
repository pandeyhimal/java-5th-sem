// Demonstrate a java program explaining user defined exception handling
package W_Exception_Handling;

class myException extends Exception {
    public myException(String s) {
        super(s);
    }
}

public class i_exception_user_defined_throw {
    public static void main(String[] args) {
        try {
            throw new myException("Exception thrown");
        } catch (myException ex) {
            System.out.println("Exception caught:");
            System.out.println("The exception is " + ex);
            System.out.println(ex.getMessage());
        }
    }
}
