package M_Static_fields_method;

class Student
{
    int roll;
    String name;
    static String clzName = "Sanothimi";

    void input(int r, String n)
    {
        roll = r;
        name = n;
    }

    void output()
    {
        System.out.println("\nRoll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("College name = " + clzName);
    }
}
public class b_static_field {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.input(23, "Himal");
        s2.input(4, "Ram");
        s3.input(6, "Hari");

        s1.output();
        s2.output();
        

        Student.clzName = "Kalika";
        s3.output();
    }
}
