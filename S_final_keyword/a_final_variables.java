package S_final_keyword;

public class a_final_variables {
    final int a = 34;
    void display(){
        System.out.println("The value of a = " + a);
    }

    public static void main(String[] args) {
        a_final_variables obj = new a_final_variables();
        obj.display();
    }
}

