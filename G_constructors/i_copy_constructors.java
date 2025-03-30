package G_constructors;

public class i_copy_constructors {
    int roll;
    String name;

    public i_copy_constructors(int r, String n) {
        roll = r;
        name = n;
    }

    public i_copy_constructors(i_copy_constructors stu) {
        System.out.println("\n After invoking copy constructors:");
        roll = stu.roll;
        name = stu.name;
    }

    int displayRoll() {
        return roll;
    }

    String displayName() {
        return name;
    }

    public static void main(String[] args) {
        i_copy_constructors s1 = new i_copy_constructors(33, "Himal");
        new i_copy_constructors(s1);
        System.out.println("ROll = " + s1.displayRoll());
        System.out.println("Name = " + s1.displayName());
    }
}
