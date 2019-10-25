#include <stdio.h>
#include <stdlib.h>

// sorting
int comp( const void*a, const void*b) {
    return ( *(int*)a - *(int*)b);
}

int main(void)
{

    // call comp run 2D Array Quick sort.
    printf("Hello world!\n");
    int array[3][2]={{7, 8}, {1, 2}, {4, 5}};
    qsort ( array, 3, sizeof(int)*2, comp);

    for( int i=0; i<3; i++) {
        for( int j=0; j<2; j++) {
            printf( "%d, ", array[i][j]);
        }
        printf("\n");
    }

    // count array size
    int array2[] = {3,7,4,5,6,9,8};
    printf( "[%d]\n", sizeof(array2)/sizeof(array2[0]));
    int arraySize = sizeof(array2)/sizeof(array2[0]);
    // 1D array Quick sort.
    qsort( array2, 7, sizeof(int), comp );
    for (int i=0; i<arraySize; i++) {
        printf("%d ", array2[i]);
    }

}

