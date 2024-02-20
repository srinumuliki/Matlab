// factorial using while 
#include<stdio.h>
main()
{
	int n,f=1;
	printf("Enter a number: ");
	scanf("%d",&n);
	while(n>0)
	{
		f=f*n;
		n--;
	}
	printf("Factorial of a number is: %d",f);
}
