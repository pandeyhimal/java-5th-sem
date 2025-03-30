package N_Nested_class_and_inner_class;

public class f_static_nested_class_with_static_method {
    static int age = 43;

    //static nested class
    static class NestedClassTwo{
        static void display()
        {
            System.out.println("Age = " + age);
        }
    }

    public static void main(String[] args) {
        f_static_nested_class_with_static_method.NestedClassTwo.display();
    }
}
