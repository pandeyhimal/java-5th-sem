package R_Polymorphism;

class Teacher {
    void Study() {
        System.out.println("Teacher is studying:");
    }
}

public class i_method_overriding extends Teacher {
    void Study() {
        System.out.println("Boy is running:");
    }

    public static void main(String[] args) {
        Teacher t1 = new i_method_overriding();
        Teacher t2 = new Teacher();
        t1.Study();
        t2.Study();

        // Teacher a, b;
        // a = new i_method_overriding();
        // b = new Teacher();
    }
}
