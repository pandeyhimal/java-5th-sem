package W_Exception_Handling;

public class c_exception_array_null {
    public static void main(String[] args) {
        // int[] arr = null;

        try {
            // System.out.println(arr[4]);

        }
        // catch (Exception e) {
        // System.out.println("Array is null:");
        // }
        catch (NullPointerException e) {
            System.out.println("Null pointer Exception:");
            System.out.println(e);
        }
    }
}
