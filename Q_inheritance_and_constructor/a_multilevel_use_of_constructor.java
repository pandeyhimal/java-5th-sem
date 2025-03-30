package Q_inheritance_and_constructor;

class GrandDad {
    GrandDad() {
        System.out.println("Calling default constructor from GrandDad class:");
    }

    GrandDad(int x) {
        System.out.println("Calling parameterized constructor from GrandDad class with the valud of X = " + x);
    }
}

class Dad extends GrandDad {
    Dad() {
        System.out.println("Calling default constructor from Dad:");
    }

    Dad(int x, int y) {
        super(x);
        System.out.println("Calling parameterized constructor from Dad class with the valud of x = " + x + " and y = "  + y);
    }
}

class SOn extends Dad {
    SOn() {
        System.out.println("Calling default constructor from SOn:");
    }

    SOn(int x, int y, int z) {
        System.out.println("Calling parameterized constructor from SOn class with the valud of z = " + z);
    }
}

public class a_multilevel_use_of_constructor {
public static void main(String[] args) {
    // GrandDad gd1 = new GrandDad();
    // GrandDad gd2 = new GrandDad(10);

    Dad d1 = new SOn();
    Dad d2 = new Dad(5,10);
}
}
