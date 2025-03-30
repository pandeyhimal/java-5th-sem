package T_abstract_keyword;

abstract class Banks {
    abstract void SiCalc(int x);
}

class NicAsia extends Banks {
    float a = 8.7f;

    @Override
    void SiCalc(int x) {
        int b = x;
        System.out.println("The Interest  you accured from nicasia bank  is " + (b * a / 100));
    }
}

class Everest extends Banks {
    float a = 10.6f;

    @Override
    void SiCalc(int x) {
        int b = x;
        System.out.println("The Interest  you accured from  everest bank  is " + (b * a / 100));
    }
}

class Gbl extends Banks {
    float a = 12.7f;

    @Override
    void SiCalc(int x) {
        int b = x;
        System.out.println("The Interest  you accured from  gbl bank  is " + (b * a / 100));
    }
}

public class b_task {
    public static void main(String[] args) {
        Banks obj1 = new NicAsia();
        Banks obj2 = new Everest();
        Banks obj3 = new Gbl();

        obj1.SiCalc(1000);
        obj2.SiCalc(1000);
        obj3.SiCalc(1000);
    }
}
