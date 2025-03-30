package J_This_keyword;

class Nums{
    Nums()
    {
        System.out.println("Hello I am default constructor:");
    }
    Nums(int a){
        this();
        System.out.println("The value is =" + a);
    }
}
public class c_this_current_class_constructor {
    public static void main(String[] args) {
        // Nums obj = new Nums();
        new Nums(33);
    }
}
