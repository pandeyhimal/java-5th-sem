package G_constructors;

public class g_paramerized_constructor {
    int roll;
    String name;

    public g_paramerized_constructor(int r, String n)
    {
        roll = r;
        name = n;
    }
    void display()
    {
        System.out.println("\n Roll = " + roll);
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {
        g_paramerized_constructor obj1 = new g_paramerized_constructor(34, "Himal");
        g_paramerized_constructor obj2 = new g_paramerized_constructor(53, "Pandey");
        obj1.display();
        obj2.display();
    }
}
