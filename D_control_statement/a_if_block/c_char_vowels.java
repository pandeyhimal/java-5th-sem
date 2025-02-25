package D_control_statement.a_if_block;

import java.util.Scanner;

public class c_char_vowels {
    public static void main(String[] args) {
        Scanner chr = new Scanner(System.in);
        System.out.println("Enter any vowel letter:");
        char vwl = chr.next().charAt(0);
        if (vwl == 'A' || vwl == 'E' || vwl == 'I' || vwl == 'O' || vwl == 'U' || vwl == 'a' || vwl == 'e' || vwl == 'i'
                || vwl == 'o' || vwl == 'u') {
            System.out.println("The letter you entered '" + vwl + "' is a vowel letter.");
        } else {
            System.out.println("The letter you entered '" + vwl + "' doesn\'t belongs to vowel letter.");
        }
        chr.close();
    }
}
