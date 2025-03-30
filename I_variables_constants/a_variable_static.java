package I_variables_constants;

class Student {
    static int clzid = 7921012;
    int roll;
    String name;

    public void inputDetails(int r, String n) {
        roll = r;
        name = n;
    }

    public void displayDetails() {
        System.out.println("\n College ID = " + clzid);
        System.out.println("Roll = " + roll);
        System.out.println("Name = " + name);
    }
}

public class a_variable_static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inputDetails(33, "Himal Pandey");
        s1.displayDetails();

        Student s2 = new Student();
        s2.inputDetails(12, "Himal Pandey");
        s2.displayDetails();
    }
}
