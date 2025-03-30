package G_constructors;

public class f_parameterized_constructor {
    public f_parameterized_constructor() {
        System.out.println("Default constructor is invoked:");
    }

    public f_parameterized_constructor(int a, int b) {
        System.out.println("Parameterized constructor is invoked with an integer values.");
    }

    public f_parameterized_constructor(int a, String b) {
        System.out.println("Parameterized connstructor is invoked with an integer value and a string value.");
    }

    public static void main(String[] args) {
        new f_parameterized_constructor();
        new f_parameterized_constructor(5, 6);
        new f_parameterized_constructor(5, "HIMAL");
    }
}
