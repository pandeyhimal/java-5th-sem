package J_This_keyword;

class Stud {
    int roll;
    String name, course;
    float marks;

    Stud(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    Stud(int roll, String name, String course, float marks) {
        this(roll, name, course);
        this.marks = marks;
    }

    void displayDetaila() {
        System.out.println("\nRoll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Course = " + course);
        System.out.println("Marks = " + marks);
    }
}

public class e_this_current_class_constructor {
    public static void main(String[] args) {
        Stud s1 = new Stud(5, "Bishal", "ICT");
        s1.displayDetaila();
        Stud s2 = new Stud(2, "Bikash", "IT", 56.34f);
        s2.displayDetaila();
}
}
