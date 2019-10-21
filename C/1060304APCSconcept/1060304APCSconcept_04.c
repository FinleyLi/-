/******************************************************************************

1060304APCSconcept_04

Thanks, GDB online is an online compiler and debugger tool...
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

// Return value
int GCD (int a, int b) {
    int r;
    r = a % b;
    
    if (r == 0)
        return b;
    return GCD( b, r);
}


// no Return value
void FinleyLi(){
    // code goes here
}

int main(void)
{
    printf( "%d", GCD( 14, 21) );
}
