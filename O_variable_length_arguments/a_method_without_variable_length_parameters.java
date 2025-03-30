package O_variable_length_arguments;

public class a_method_without_variable_length_parameters {
    public int add(int a, int b) {
        return (a + b);
    }

    public int add(int a, int b, int c) {
        return (a + b + c);
    }

    public static void main(String[] args) {
        a_method_without_variable_length_parameters obj = new a_method_without_variable_length_parameters();
        System.out.println("The of two integers = " + obj.add(4, 6));
        System.out.println("The sum of three integers valud = " + obj.add(4, 6, 3));
    }
}
