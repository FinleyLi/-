/******************************************************************************
1060304APCSconcept_06
Thanks, GDB online is an online compiler and debugger tool...
Code, Compile, Run and Debug online from anywhere in world.
*******************************************************************************/
#include <stdio.h>

// Return value
int Finley(){
    // code goes here
    return 9527;
}

// no Return value
void FinleyLi(){
    // code goes here
}

/*
The elements of a 2D array are arranged in rows and columns, and the new operator for 2D arrays specifies both the number of rows and the number of columns. For example, int[][] A; A = new int[3][4]; This creates a 2D array of int that has 12 elements arranged in 3 rows and 4 columns.
*/
int main(void)
{
    /* 2D array declaration*/
    int inputArray[5][4];
    /*Counter variables for the loop*/
    for(int i=0; i<5; i++) {
        for(int j=0; j<4; j++) {
            printf( "Enter value for abc[%d][%d]:", i, j);
            scanf( "%d", &inputArray[i][j]);
        }
    }
    int M = 5, N =4;
    int A[5][4] ={
            {0,1,2,3},
            {4,5,6,7},
            {8,9,10,11},
            {12,13,14,15},
            {16,17,18,19}
            };
    
    int rowsum = 0;
    for (int i=0; i<M; i=i+1) {
        for (int j=0; j<N; j=j+1) {
            rowsum = rowsum + inputArray[i][j];
        }
    printf("The sum of row %d is %d.\n", i, rowsum);
    rowsum = 0; // <==
    }

}