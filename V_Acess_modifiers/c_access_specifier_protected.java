package V_Acess_modifiers;

class College {
    protected String name = "Sanothimi Campus:";            //protected variable
}

class a {
    protected int display(int x, int y) {                   //protected method
        return x + y;
    }
}

public class c_access_specifier_protected extends a {
    public static void main(String[] args) {
        College obj = new College();
        System.out.println("The name of college is = " + obj.name);

        c_access_specifier_protected obj1 = new c_access_specifier_protected();
        System.out.println("The sum of two values = " + obj1.display(5, 8));
    }
}
