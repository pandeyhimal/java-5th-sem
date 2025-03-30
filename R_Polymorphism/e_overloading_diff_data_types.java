package R_Polymorphism;

class Nums {
    int add(int a, int b) {
        return (a + b);
    }

    double add(double a, double b) {
        return (a * b);
    }
}

public class e_overloading_diff_data_types {
    public static void main(String[] args) {
        Nums obj = new Nums();
        int sum1 = obj.add(32, 7);
        double sum2 = obj.add(23.32, 4.2);
        System.out.println("The sum of integers = " + sum1);
        System.out.println("The sum of double =" + sum2);
    }
}
