package T_abstract_keyword;

abstract class Dad {
    abstract void hi();
}

class Son extends Dad {
    @Override
    void hi() {
        System.out.println("Hi form Son class:");
    }
}

class Daughter extends Dad {
    @Override
    void hi() {
        System.out.println("Hi from Daughter class:");
    }
}

public class a_abstract_class {
    public static void main(String[] args) {
        Dad obj = new Son();
        Dad obj1 = new Daughter(); // up casting for overriding function
        obj.hi();
        obj1.hi();
    }
}