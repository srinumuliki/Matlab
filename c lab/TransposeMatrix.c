#include <stdio.h>
int main()
{
 int n;
 printf("Enter the size of the matrices: ");
 scanf("%d", &n);
 int A[n][n];
 int B[n][n]; 
 int C[n][n]; 
 int i, j, k, sum; 
 printf("Enter the elements of the first matrix: \n");
 for (i = 0; i < n; i++)
 {
 for (j = 0; j < n; j++)
 {
 printf("Enter A[%d][%d]: ", i, j);
 scanf("%d", &A[i][j]);
 }
 }
 printf("Enter the elements of the second matrix: \n");
 for (i = 0; i < n; i++)
 {
 for (j = 0; j < n; j++)
 {
 printf("Enter B[%d][%d]: ", i, j);
 scanf("%d", &B[i][j]);
 }
 }
 for (i = 0; i < n; i++)
 {
 for (j = 0; j < n; j++)
 {
 sum = 0; 
 for (k = 0; k < n; k++)
 { sum += A[i][k] * B[k][j]; }
 C[i][j] = sum; 
 }
 }
 printf("The product of the two matrices is: \n");
 for (i = 0; i < n; i++)
 {
 for (j = 0; j < n; j++)
 {
 printf("%d ", C[i][j]);
 }
 printf("\n");
 }
 return 0;
}

