package S_final_keyword;

class Dad {
    // final void cooking(){}
    void method1() {
        System.out.println("Method from Dad class:");
    }
}

class Daughter extends Dad {
    @Override
    void method1() {
        System.out.println("Method from Daughter class:");
    }
}

public class c_final_method {
    public static void main(String[] args) {
        Daughter obj1 = new Daughter();
        obj1.method1();

        Dad obj2 = new Dad();
        obj2.method1();
    }
}
