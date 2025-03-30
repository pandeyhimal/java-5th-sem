package N_Nested_class_and_inner_class;

//outer class
public class a_member_inner_class {
    String clzname = "Sanothimi";

    // inner class
    class InnerOne {
        void display() {
            System.out.println("College name = " + clzname);
        }
    }

    public static void main(String[] args) {
        a_member_inner_class obj = new a_member_inner_class();
        a_member_inner_class.InnerOne IOobj = obj.new InnerOne();
        IOobj.display();
    }
}
