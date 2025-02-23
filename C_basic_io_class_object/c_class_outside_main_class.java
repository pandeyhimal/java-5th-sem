package C_basic_io_class_object;

class Student 
{
    int roll = 21;
    String name = "Himal Pandey";
}
public class c_class_outside_main_class {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("ROll no: = " + s1.roll);
        System.out.println("Name = " + s1.name);
    }
}
