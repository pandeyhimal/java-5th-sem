package W_Exception_Handling;

import java.util.Scanner;

class WeightException extends Exception {
    public WeightException(String s) {
        super(s);
    }
}

public class j_weight_of_product {
    void checkValidWeight(int weight) throws WeightException {
        if (weight < 100) {
            throw new WeightException("Invalid weight found:");
        } else {
            System.out.println("Product is ready for further processing:");
        }
    }

    public static void main(String[] args) {
        j_weight_of_product obj = new j_weight_of_product();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of a product:");
        // double a = sc.nextDouble();
        // sc.close();
        // try {
        // if (a < 100) {
        // throw new Exception("The weight you provide is less than 100Kg:");
        // } else {
        // System.out.println("Valid weight " + a + "Kg.");
        // }
        // } catch (Exception e) {
        // System.out.println("Invalid weight " + e);
        // }
        int wt = sc.nextInt();
        sc.close();

        try {
            obj.checkValidWeight(wt);
        } catch (WeightException e) {
            System.out.println(e.getMessage());
        }
    }
}
