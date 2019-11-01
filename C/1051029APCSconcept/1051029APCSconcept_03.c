/*
** 1051029觀念題03 
** 遞迴
** Compiler version gcc  6.3.0
*/

#include <stdio.h>

int K(int a[], int n)
{
  if ( n>= 0 )
    return ( K( a, n-1) + a[n] );
  else
    return 0;
}
int G(int n)
{
  int a[] = { 5, 4, 3, 2, 1};
  return K( a, n);
}

void main()
{
  printf("%d", G(3));
}
