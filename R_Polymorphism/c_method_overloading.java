//method overloading also known as compile time polymorhpism
// In a same method using different number of parameters
// using difference data types
// using different sequence of parameters

package R_Polymorphism;

class Pattern {

    // method without parameter
    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    // method with single parameter
    public void display(char symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }
}

public class c_method_overloading {
    public static void main(String[] args) {
        Pattern d1 = new Pattern();

        // call method without any argument
        d1.display();
        System.out.println("\n");

        // call method with a single argument
        d1.display('#');
    }
}
