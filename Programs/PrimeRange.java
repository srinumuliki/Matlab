
package Programs;

/* 2. Write a Java Program that prompts the user for an integer and then prints
out all the prime numbers up to that Integer.*/

import java.util.Scanner;
class PrimeRange {
    public static void main(String args[])  {
        Scanner sc  = new Scanner(System.in);
        int n, i, j, count = 0;
        n = sc.nextInt();

        for(i = 2; i <= n; i++) {
            count = 0;

            for(j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    count++;
                }
            }
            if(count == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
