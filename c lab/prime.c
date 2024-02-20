#include<stdio.h>
main()
{
	int i,n,count=0;
	printf("Enter a number: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
			break;
		}	
	}
	if(count==2)
	printf("It is a prime number: ");
	else
	printf("It is not a prime number: ");
}
