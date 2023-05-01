#include<stdio.h>
int i,j,p,r;
int avail[20],need[20][20],alloc[20][20],max[20][20];
void accept();
void display();
void accept()
{
	printf("Enter number of processes:");
	scanf("%d",&p);
	printf("Enter number of resources:");
	scanf("%d",&r);
	printf("Enter allocation matrix:");
	for(i=0;i<p;i++)
	{
		for(j=0;j<r;j++)
		{
			scanf("%d",&alloc[i][j]);
		}
	}
	printf("Enter the MAX matrix:");
	for(i=0;i<p;i++)
	{
		for(j=0;j<r;j++)
		{
		scanf("%d",&max[i][j]);
		}
	}
	printf("Enter available matrix:");
	for(i=0;i<r;i++)
	{
		scanf("%d",&avail[i]);
	}
}
void display()
{
	printf("\nAllocation matrix:\n");
	for(i=0;i<p;i++)
	{
		for(j=0;j<r;j++)
		{
			printf("%d\t",alloc[i][j]);
		}
		printf("\n");
	}
	printf("\nMAX matrix:\n");
	for(i=0;i<p;i++)
	{
		for(j=0;j<r;j++)
		{
			printf("%d\t",max[i][j]);
		}
		printf("\n");
	}
	printf("\nNeed Matrix:\n");
	for(i=0;i<p;i++)
	{
		for(j=0;j<r;j++)
		{
			need[i][j]=max[i][j]-alloc[i][j];
		}
	}
	for(i=0;i<p;i++)
	{
		for(j=0;j<r;j++)
		{
			printf("%d\t",need[i][j]);
		}
		printf("\n");
	}
	printf("Available matrix:\n");
	for(i=0;i<r;i++)
	{
		printf("%d\t",avail[i]);
	}
}
void main()
{
	accept();
	display();
}
