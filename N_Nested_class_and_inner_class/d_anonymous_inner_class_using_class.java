package N_Nested_class_and_inner_class;

abstract class Student{
    abstract void study();
}
public class d_anonymous_inner_class_using_class {
    public static void main(String[] args) {
        Student obj = new Student() {
            void study()
            {
                System.out.println("Abstract method defining:");
            }
        };
        obj.study();
    }
}
