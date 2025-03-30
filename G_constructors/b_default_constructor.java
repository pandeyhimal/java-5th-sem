package G_constructors;

class Stud{
    int roll;
    String name;

    public Stud() {
        roll = 33;
        name = "Himal";
    }

    public void displayDetails()
    {
        System.out.println("Roll = " + roll);
        System.out.println("Name = " + name);
    }
}
public class b_default_constructor {
    public static void main(String[] args) {
        Stud s1= new Stud();
        s1.displayDetails();
    }
}
