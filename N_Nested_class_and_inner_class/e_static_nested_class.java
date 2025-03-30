package N_Nested_class_and_inner_class;

public class e_static_nested_class {
    static int roll = 7;

    //static nested class 
    static class NestedClass{
        void display(){
            System.out.println("Roll number = " + roll);
        }
        
    }

    public static void main(String[] args) {
        e_static_nested_class.NestedClass Nobj = new e_static_nested_class.NestedClass();
        Nobj.display();
    }
}
