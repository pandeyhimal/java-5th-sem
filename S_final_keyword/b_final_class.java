package S_final_keyword;

// final class Superclass
class Superclass {
    void hi() {
        System.out.println("I am a super class:");
    }
}

class SubClass extends Superclass {
    void hello() {
        System.out.println("I am a sub class:");
    }
}

public class b_final_class {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.hi();
        obj.hello();
    }
}
