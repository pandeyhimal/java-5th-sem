package R_Polymorphism;

class Calc {
    public void display(int a) {
        System.out.println("The value of a = " + a);
    }

    public void display(int a, int b) {
        System.out.println("The valud of a = " + a + " and b = " + b);
    }

    public void display(int a, int b, int c) {
        System.out.println("SUm = " + (a + b + c));
    }
}

public class d_overloading_diff_no_parameter {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.display(4);
        obj.display(6, 7);
        obj.display(6, 9, 5);
    }
}
