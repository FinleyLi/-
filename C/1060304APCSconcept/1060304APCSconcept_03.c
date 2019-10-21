/******************************************************************************

1060304APCSconcept_03

Thanks, GDB online is an online compiler and debugger tool...
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

// Return value
int F (int n) {
    if (n < 4)
        return n;
    else
        return n + F(n-3);
}

// no Return value
void FinleyLi(){
    // code goes here
}

int main(void)
{
    printf( "%d", F(14) );
}
