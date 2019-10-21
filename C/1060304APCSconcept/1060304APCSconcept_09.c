/******************************************************************************
1060304APCSconcept_09
Thanks, GDB online is an online compiler and debugger tool...
Code, Compile, Run and Debug online from anywhere in world.
*******************************************************************************/
#include <stdio.h>

// Return value
int Finley () {
    // code goes here
    return 0;
}

// no Return value
void F () {
    int X[10] = {0};
    for (int i=0; i<10; i=i+1) {
        scanf("%d", &X[(i+2)%10]);//0 1 2 3 4 5 6 7 8 9
    }
    for ( int j=0; j<10; j++) {
        printf("X[%d]=%d\n", j, X[j]);
    }
}

void FinleyLi(){
    // code goes here
}

int main(void)
{
    F();
    //printf("The answer of Array is %d\n", X[i]);

}