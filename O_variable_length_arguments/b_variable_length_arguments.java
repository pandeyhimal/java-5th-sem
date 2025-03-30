package O_variable_length_arguments;

public class b_variable_length_arguments {
    public int SumNum(int... args)
    {
        int sum = 0;
        for(int i : args){
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        b_variable_length_arguments obj = new b_variable_length_arguments();
        int sum1= obj.SumNum(6);
        System.out.println("The number is :" + sum1);
    
        int sum2= obj.SumNum(5,57);
        System.out.println("The sum of two integer is :" + sum2);
    
        int sum3= obj.SumNum(8,3,6);
        System.out.println("The sum of three integer is :" + sum3);
    }
}
