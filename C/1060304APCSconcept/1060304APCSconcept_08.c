/******************************************************************************
1060304APCSconcept_08
Thanks, GDB online is an online compiler and debugger tool...
Code, Compile, Run and Debug online from anywhere in world.
*******************************************************************************/
#include <stdio.h>

int s = 1; // 全域變數

// Return value
int Finley () {
    // code goes here
    return 0;
}

// no Return value
void add (int a) {
    int s = 6;
    for( ; a>=0; a=a-1) {
        printf("a=%d s is %d,\n", a, s);
        s++;
        printf("a=%d s is %d,\n", a, s);
    }
}
void FinleyLi(){
    // code goes here
}

int main(void)
{
    printf("The answer of default s is %d,\n", s);
    add(s);
    printf("\nThe answer of add(s) is %d,\n", s);
    s = 9;
    printf("The answer of s=9 is %d\n", s);
}