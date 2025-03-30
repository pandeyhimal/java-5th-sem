package N_Nested_class_and_inner_class;

//outer class
class Outerclass{
    void show()
    {
        Innerclass in = new Innerclass();
        in.display();
    }

    //inner class
    class Innerclass{
        void display()
        {
            System.out.println("Method from a Inner class:");
        }
    }
}
public class b_non_static_nested_class {
    public static void main(String[] args) {
        Outerclass obj = new Outerclass();
        obj.show();
    }
}
