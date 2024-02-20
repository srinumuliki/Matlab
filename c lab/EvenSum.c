#include <stdio.h>
int main()
{
 int n, i, sum = 0;
 printf("Enter the number of terms: ");
 scanf("%d", &n);
 printf("The even numbers are: ");
 for (i = 1; i <= n; i++)
 {
 int even = 2 * i;
 printf("%d ", even);
 sum += even;
 }
 printf("\nThe sum of the even numbers is: %d\n", sum);
 return 0;
}

