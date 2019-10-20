/*
** 1051029觀念題06
**
** Compiler version gcc  6.3.0
*/

#include <stdio.h>

//10510-06
//費式(Fibonacci)數列

long F(long n)
{
  if( n<= 2) return 1;
  return F(n-2)+F(n-3);//else
}

void main()
{
  long n;
  scanf( "%ld", &n);
  printf( "%d", F(n));
}
