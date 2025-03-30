package J_This_keyword;

class Calc {
    Calc() {
        this(7);
        System.out.println("This is a default constructor:");
    }

    Calc(int a) {
        this("Hello Sanothimi:");
        System.out.println("The value = " + a);
    }
    Calc(String msg) {
        System.out.println(msg);
    }
}

public class d_this_current_class_constructor {
    public static void main(String[] args) {
        new Calc();
    }
}
