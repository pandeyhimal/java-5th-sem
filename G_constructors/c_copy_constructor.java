package G_constructors;

import java.util.Scanner;

public class c_copy_constructor {
    public c_copy_constructor(String name) {
        System.out.println("Name:" + name);
    }
    public c_copy_constructor(int age) {
        System.out.println("Age:" + age);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        new c_copy_constructor(name);
        new c_copy_constructor(age);
        sc.close();
    }
}
