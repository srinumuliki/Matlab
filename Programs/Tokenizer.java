package Programs;

/* 7. Write a Java Program, using String Tokenizer class, which reads a line of
 * 
   integers and then displays each integer and the sum of all integers.*/


import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of integers separated by spaces: ");
        String inputLine = sc.nextLine();
        sc.close();
        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        int sum = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int number = Integer.parseInt(token);
            System.out.println("Integer: " + number);
            sum += number;
        }
        
        System.out.println("Sum of all integers: " + sum);
    }
}
