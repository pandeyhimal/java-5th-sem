package D_control_statement.a_if_block;

import java.util.Scanner;

class ctrl {
    void getdata(Scanner bc) {
        System.out.println("Enter any number:");
        int a = bc.nextInt();
        displaydata(a);
    }

    void displaydata(int x) {
        if (x > 0) {
            System.out.println("positive number:");
        } else if (x < 0) {
            System.out.println("Negative number:");
        } else {
            System.out.println("Number is Zero:");
        }
    }
}

public class b_nested_if_else_statement {
    public static void main(String[] args) {
        Scanner bc = new Scanner(System.in);
        ctrl c1 = new ctrl();
        c1.getdata(bc);
        // c1.displaydata();
        bc.close();
    }
}
