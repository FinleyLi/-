/*
** 1060304觀念題02
** for loop
** Compiler version gcc  6.3.0
*/

#include <stdio.h>

void A1 (int n) {
	F(n/5);
	F(4*n/5); 
}

void A2 (int n) {
	F(2*n/5);
	F(3*n/5); 
}

void F (int x) {
	int i;
	for (i=0; i<x; i=i+1) 
		printf("*");
	if (x>1) {
    	F(x/2);
    	F(x/2);
	} 
}


void main()
{
	printf("A1(5) vs. A2(5) \n");
    A1(5);
    printf("\n");
	A2(5);
    printf("\n");
    printf("A1(13) vs. A2(13) \n");
    A1(13);
    printf("\n");
	A2(13);
    printf("\n");
    printf("A2(14) vs. A1(14) \n");
    A1(14);
    printf("\n");
	A2(14);
    printf("\n");
    printf("A2(15) vs. A1(15) \n");
    A1(15);
    printf("\n");
	A2(15);
}


