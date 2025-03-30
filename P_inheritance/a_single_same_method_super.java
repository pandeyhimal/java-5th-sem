package P_inheritance;

class Teacher {
    void Study() {
        System.out.println("Teacher is studying:");
    }
}

class Student extends Teacher {
    void Study() {
        super.Study(); // method form super class
        System.out.println("Student is studying....");
    }
}

public class a_single_same_method_super {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Study(); // executes super class method first
    }
}
