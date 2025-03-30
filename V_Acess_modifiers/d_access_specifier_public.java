package V_Acess_modifiers;

class abc {
    public int a = 7;
}

public class d_access_specifier_public {
    public static void main(String[] args) {
        abc obj = new abc();
        System.out.println("The value = " + obj.a);
    }
}
