package P_inheritance;

class Dad {
    void hi() {
        System.out.println("Hi child:");
    }
}

class Mom {
    void hello() {
        System.out.println("Hello child:");
    }
}

// class Child extends Dad,Mom{
class Child extends Dad {
    void Greetings() {
        System.out.println("Namaste parents!");
    }
}

public class b_multiple_problem_scenario {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.Greetings();
        // c1.hi();
        // c1.hello();
    }
}
