package G_constructors;

public class j_constructor_overloading {
    public j_constructor_overloading() {
        System.out.println("Hello I'm a default constructor:");
    }
    public j_constructor_overloading(int a) {
        System.out.println("Square of " + a + " = " + (a * a));
    }
    public j_constructor_overloading(double b) {
        System.out.println("Hello i'm double value equals to " + b);
    }
    public j_constructor_overloading(int a, String b) {
        System.out.println("My name is " + b + " and roll number " + a);
    }

    public static void main(String[] args) {
        // j_constructor_overloading obj1 = new j_constructor_overloading();
        // j_constructor_overloading obj2 = new j_constructor_overloading(33);
        // j_constructor_overloading obj3 = new j_constructor_overloading(3.14);
        // j_constructor_overloading obj4 = new j_constructor_overloading(7, "Himal");

        new j_constructor_overloading();
        new j_constructor_overloading(7);
        new j_constructor_overloading(3.14);
        new j_constructor_overloading(33, "Himal");
     
    }
}
