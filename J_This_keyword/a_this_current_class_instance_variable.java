package J_This_keyword;

class Student {
    int roll;
    String name;
    float marks;

    // Student(int roll, String name, float marks){
    // roll = roll;
    // name =name;
    // marks = marks;
    // }

    // Student(int r, String n, float m){
    // roll = r;
    // name =n;
    // marks = m;
    // }

    Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("\nRoll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
    }

}

public class a_this_current_class_instance_variable {
    public static void main(String[] args) {
        Student s1 = new Student(33, "Himal Pandey", 90.42f);
        s1.display();
        Student s2 = new Student(34, "Ram Pandey", 99.42f);
        s2.display();
    }
}
