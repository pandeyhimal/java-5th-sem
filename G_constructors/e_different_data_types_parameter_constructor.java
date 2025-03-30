package G_constructors;

// import java.util.Scanner;

class sum
{
    public sum(int a, int b)
    { 
        System.out.println("Sum of int a and int b= " + (a+b));
    }
    public sum(int a, int b, int c, int d)
    { 
        System.out.println("Sum of  int a, int b, int c, int d = " + (a+b+c+d));
    }
    public sum(float a, int b, double c, int d)
    { 
        System.out.println("Sum of float a, int b, double c and int d = " + (a+b+c+d));
    }
    public sum(String a, float b, double c, int d)
    { 
        System.out.println("Sum of string a, float b, double c and int d = " + a+(b+c+d));
    }
    public sum(int a, float b, int c, double d)
    { 
        System.out.println("Sum of int a, float b, int c and double d = " + (a+b+c+d));
    }
}
public class e_different_data_types_parameter_constructor {
    public static void main(String[] args) {
        // int a = 34, b = 45, c= 43, d= 10;
        // float e = 3, f = 72;
        // double g = 34.32, h = 2.82;
        new sum(4,6);
        new sum(5,5,7,8);
        new sum(6, 8, 5, 6.3);
        new sum("Ram", 4, 4.2, 7);
        new sum(7, 3, 53.3, 4);
    }
}