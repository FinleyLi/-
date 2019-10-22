#include <stdio.h>

/* function to generate and return random numbers */
int *getRandom( ) {

   static int  r[5];
   int i;

   /* set the seed */
   //srand( (unsigned)time( NULL ) );
  
   for ( i = 0; i < 5; ++i) {
       printf("input array[%d] = ", i);
       scanf( "%d", &r[i]);
      //printf( "r[%d] = %d\n", i, r[i]);
   }

   return r;
}

/* main function to call above defined function */
int main () {

   /* a pointer to an int */
   int *p;
   int i;

   p = getRandom();
	
   for ( i = 0; i < 5; i++ ) {
      printf( "*(p + %d) : %d\n", i, *(p + i));
   }

   return 0;
}