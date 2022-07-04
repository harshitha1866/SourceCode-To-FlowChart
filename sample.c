#include <stdio.h>
int main()
{
    int a = 5;
	if(a==5)
	{ 
		printf("Number is");
		printf("%d",a);
	}
	else
	{ 
		printf("Number is not");
		printf("%d",a);
	}
	switch(a)
	{
		case 1: a = 1;
		case 2: a = 2;
		case 3: a = 3;
		case 4: a = 4;
		case 5: a = 5;	
	}
	printf("%d",a);
	for(int i=0;i<5;i++)
		printf("%d",a);
    return 0;
}