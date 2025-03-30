package M_Static_fields_method;

import java.util.Scanner;

public class d_classwork {
    static int a;
    static String name;

    static void displayByStatic(int x, String n) {
        a = x;
        name = n;
        System.out.println("Display by using Static method:");
        System.out.println("Static integer value = " + a);
        System.out.println("Static String = " + name);
    }

    void displayByinstancemethod() {
        System.out.println("\nDisplay by using instance method:");
        System.out.println("Integer value = " + a);
        System.out.println("String value = " + name);
    }

    //calling static method using instance method.
    // void displayByinstancemethod(){
    // displayByStatic(a, name);
    // }

    public static void main(String[] args) {
        d_classwork obj = new d_classwork();
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter integer value:");
        int a = ab.nextInt();
        System.out.println("Enter your name:");
        String name = ab.next();
        displayByStatic(a, name);
        obj.displayByinstancemethod();
        ab.close();
    }
}
