package R_Polymorphism;

class GrandMa {
    void hello() {
        System.out.println("HELlO from grandma:");
    }
}

class Ma extends GrandMa {
    void hello() {
        System.out.println("Hello from your GrandMa:");
    }
}

class child extends Ma {
    void hello() {
        System.out.println("Hello forn your child:");
    }
}

public class h_method_overriding {
    public static void main(String[] args) {
        // GrandMa a, b, c;
        // a = new GrandMa();
        // b = new Ma();
        // c = new child();

        GrandMa  a = new GrandMa();
        GrandMa  b = new Ma();
        GrandMa  c = new child();

        a.hello();
        b.hello();
        c.hello();
    }
}
