package G_constructors;

class Teacher
{
    // int tid;
    public Teacher(int a){
       int tid = a;
        System.out.println("Teacher ID = " + tid);
    }
}
public class d_parameterized_constructor {
    public static void main(String[] args) {
        new Teacher(33);
    }
}
