/******************************************************************************
1060304APCSconcept_07
Thanks, GDB online is an online compiler and debugger tool...
Code, Compile, Run and Debug online from anywhere in world.
*******************************************************************************/
#include <stdio.h>

// Return value
int B (int n, int k) {
    if (k == 0 || k == n){
        printf ("base case\n");
        return 1;
    }
    return B(n-1,k-1) + B(n-1,k);
}

// no Return value
void FinleyLi(){
    // code goes here
}

int main(void)
{
    printf("The answer of B(5, 2) is %d.\n", B( 5, 2));
}