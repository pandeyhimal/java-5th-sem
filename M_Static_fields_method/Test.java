// Java program to demonstrate execution
// of static blocks and variables
package M_Static_fields_method;

public class Test {

    // static variable
    static int b;


    // static method
    static void m1(int b)
    {
        System.out.println(b);
      //return 0;
    }

    // static method(main !!)
    public static void main(String[] args)
    {
        System.out.println("The value of static variable :");
        Test.m1(8);
    }
}