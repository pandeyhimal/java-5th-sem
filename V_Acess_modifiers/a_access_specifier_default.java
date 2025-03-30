package V_Acess_modifiers;

class Nums {
    // It is default access specifier variable, where there is not any access specifier are
    // used:
    int a = 4;
}

public class a_access_specifier_default {

    public static void main(String[] args) {
        Nums obj = new Nums();
        System.out.println("The value = " + obj.a);
    }
}