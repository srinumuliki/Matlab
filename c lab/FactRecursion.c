//factorial using recursion
#include<stdio.h>
int Fact(int n)
{
	if (n==1)
	{
		return 1;
	}
	return n*Fact(n-1);
}
int factorial_non_recursive(int n) {
 int result = 1;
 while (n > 1) {
 result *= n;
 n--;
 }
 return result;
}
int main()
{
	int n;
	printf("Enter a number: ");
	scanf("%d",&n);
	int rest=Fact(n);
	printf("%d",rest);
	int rest=factorial_non_recursive(n);
	printf("%d",rest);
	
}
