package C_basic_io_class_object;

import java.util.Scanner;

class Studnt {
    int roll , age;
    String address , name;
    void getdata(Scanner sc)
    {
        System.out.println("Enter roll:");
        roll= sc.nextInt();
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter address:");
        address = sc.next();
    }
    void display()
    {
        System.out.println("Roll No: " + roll);
        System.out.println("Age : " + age);
        System.out.println("Adress : " + address);
        System.out.println("Name : " + name);
    }
}
public class e_user_input_student_details {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Studnt s1 = new Studnt();
        System.out.println("Enter the details of student 1:");
        s1.getdata(sc);
        Studnt s2 = new Studnt();
        System.out.println("Enter the details of student 2:");
        s2.getdata(sc);
        Studnt s3 = new Studnt();
        System.out.println("Enter the details of student 3:");
        s3.getdata(sc);

        System.out.println("Displaying the details of student 1:");
        s1.display();
        System.out.println("Displaying the details of student 2:");
        s2.display();
        System.out.println("Displaying the details of student 3:");
        s3.display();
        sc.close();
    }
}
