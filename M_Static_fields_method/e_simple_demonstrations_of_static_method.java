package M_Static_fields_method;

public class e_simple_demonstrations_of_static_method {
    // Static method to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling static method without creating an object
        System.out.println("Sum: " + e_simple_demonstrations_of_static_method.add(5, 3)); // Output: Sum: 8
    }

}
