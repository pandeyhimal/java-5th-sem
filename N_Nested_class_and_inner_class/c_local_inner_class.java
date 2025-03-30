package N_Nested_class_and_inner_class;

public class c_local_inner_class {
    int clzid = 23;

    void displayclzid()
    {
        class InnerClassThree{
            void display()
            {
                System.out.println("College id = " + clzid);
            }
        }
        InnerClassThree in =  new InnerClassThree();
        in.display();
    }

    public static void main(String[] args) {
        c_local_inner_class out = new c_local_inner_class();
        out.displayclzid();
    }
}
