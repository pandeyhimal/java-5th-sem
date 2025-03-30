package R_Polymorphism;

class Dad {
    // overridden method
    void display() {
        System.out.println("Overridden method:");
    }
}

class Daughter extends Dad {
    // overriding method
    @Override
    void display() {
        System.out.println("Overriding method:");
    }
}

public class g_overriding {
    public static void main(String[] args) {
        Daughter obj = new Daughter();
        obj.display();

        Dad obj1 = new Dad();
        obj1.display();
    }
}
