package M_Static_fields_method;

public class c_static_field_method {
    // instance field
    int a = 34;

    // static field
    static int b = 65;

    // instance method
    void displayInstanceMethod() {
        System.out.println("The value of a = " + a);
        System.out.println("The value of b = " + b);
    }

    // static method
    static void displayStaticMethod() {
        /* System.out.println("The value of a = " + a); can't access the non-static
        field in static method */
        System.out.println("The value of b = " + b);
    }

    public static void main(String[] args) {
        c_static_field_method obj = new c_static_field_method();
        obj.displayInstanceMethod();
        displayStaticMethod();
    }
}
