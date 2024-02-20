#include <stdio.h>
// Function to calculate GCD recursively
int gcd_recursive(int n, int m) {
 if (m == 0) {
 return n;
 } else {
 return gcd_recursive(m, n % m);
 }
}
// Function to calculate GCD non-recursively
int gcd_non_recursive(int n, int m) {
 int temp;
 while (m != 0) {
 temp = n;
 n = m;
 m = temp % m;
 }
 return n;
}
int main() {
 int n, m;
 printf("Enter two numbers: ");
 scanf("%d %d", &n, &m);
 if (n < 0 || m < 0) {
 printf("GCD is not defined for negative numbers.\n");
 } else {
 int result_recursive = gcd_recursive(n, m);
 int result_non_recursive = gcd_non_recursive(n, m);
 
 printf("GCD of %d and %d (recursive) is: %d\n", n, m, result_recursive);
 printf("GCD of %d and %d (non-recursive) is: %d\n", n, m, result_non_recursive);
 }
 return 0;
}
