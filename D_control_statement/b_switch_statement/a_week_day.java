package D_control_statement.b_switch_statement;

import java.util.Scanner;

public class a_week_day {
    public static void main(String[] args) {
        Scanner week_day = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 7:");
        int day = week_day.nextInt();
        week_day.close();

        switch (day) {
            case 1:
                System.out.println("Sunday:");
                break;
            case 2:
                System.out.println("Monday:");
                break;
            case 3:
                System.out.println("Tuesday:");
                break;
            case 4:
                System.out.println("Wednesday:");
                break;
            case 5:
                System.out.println("Thursday:");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday:");
                break;
            default:
                System.out.println("Not appropriate number entered:");
                break;
        }
    }
}
