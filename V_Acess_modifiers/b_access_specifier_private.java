package V_Acess_modifiers;

class Student {
    // private int roll = 33;               //only accessable within a class
    public int roll = 33;
}

public class b_access_specifier_private {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("The RollNo. is = " + obj.roll);
    }
}
