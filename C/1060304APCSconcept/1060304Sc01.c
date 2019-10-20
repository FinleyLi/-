/*
** 1060304觀念題01
** A[]大於Ｓearch(x)的最小值
** Compiler version gcc  6.3.0
*/

#include <stdio.h>

int A[8]={0, 2, 4, 6, 8, 10, 12, 14};

int Search (int x) 
{ 
	int high = 7;
	int low = 0;

	while (high > low) {
		int mid = (high + low)/2;
		if (A[mid] <= x) {
			low = mid + 1; 
		}
		else {
			high = mid;
		} 
	}
    return A[high];
}

void main()
{
  printf( "%d \n", Search(-1));
  printf( "%d \n", Search(0));
  printf( "%d \n", Search(10));
  printf( "%d \n", Search(16));
}

