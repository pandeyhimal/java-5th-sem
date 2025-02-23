package C_basic_io_class_object;

import java.util.Scanner;

class Stud{
    int roll, age;
    String name, address;

    void inputDetails(int r, int a, String n, String ad){
        roll = r;
        age = a;
        name = n;
        address = ad;
    }
    void inputfromUser()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of student");
        System.out.println("Enter your rollno: ");
        roll = sc.nextInt();
        System.out.println("Enter you age: ");
        age = sc.nextInt();
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your address: ");
        address = sc.next();
        sc.close();
    }
    void displayDetails()
    {
        System.out.println("Roll = " + roll);
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
    }
}
public class d_student_details {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.inputDetails(234, 23, "Himal", "Sanothimi");
        //s1.inputfromUser();
        s1.displayDetails();
    }
}
