package D_control_statement.a_if_block;

import java.util.Scanner;

public class d_percentage_calculation {
    public static void main(String[] args) {
        result rs = new result();
        Scanner per = new Scanner(System.in);
        System.out.println("Enter the marks of an individual subject:");
        System.out.println("Enter the marks in Mathematics:");
        float math = per.nextInt();
        System.out.println("Enter the marks in Science:");
        float science = per.nextInt();
        System.out.println("Enter the marks in English:");
        float english = per.nextInt();
        System.out.println("Enter the marks in Nepali:");
        float nepali = per.nextInt();
        System.out.println("Enter the marks in Moral:");
        float moral = per.nextInt();

        double percentage = (math + science + english + nepali + moral) / 5;
        System.out.println("The percentage you obtained is " + percentage + "%");
        per.close();

        if (math >= 40 && science >= 40 && english >= 40 && nepali >= 40 && moral >= 40) {
            rs.percentage_result(percentage);
        } else {
            System.out.println("You have failed:");
        }
    }
}

class result {

    void percentage_result(double percentage) {
        if (percentage >= 90) {
            System.out.println("Outstanding:");
        } else if (percentage >= 80) {
            System.out.println("Distinction:");
        } else if (percentage >= 70) {
            System.out.println("First Division:");
        } else if (percentage >= 60) {
            System.out.println("Second Division:");
        } else if (percentage >= 50) {
            System.out.println("Third Division:");
        } else if (percentage >= 40) {
            System.out.println("Not Satisfactory:");
        } else {
            System.out.println("Failed:");
        }
    }
}