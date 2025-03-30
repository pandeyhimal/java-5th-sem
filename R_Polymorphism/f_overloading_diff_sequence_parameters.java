package R_Polymorphism;

class Sum {
    void add(int a, double b) {
        System.out.println("The sum = " + (a + b));
    }

    void add(double a, int b) {
        System.out.println("The sum = " + (a + b));
    }
}

public class f_overloading_diff_sequence_parameters {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.add(4, 23.23);
        obj.add(3.23, 4);
    }
}
