/******************************************************************************

1060304APCSconcept_05

Thanks, GDB online is an online compiler and debugger tool...
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

// Return value
int GCD () {
    // code goes here
    return GCD();
}


// no Return value
void FinleyLi(){
    // code goes here
}

int main(void)
{
    int numbers[] = {1, 2, 3, 4, 5, 6};
    printf("陣列長度：%d\n", sizeof(numbers) / sizeof(numbers[0]));
    
    int len = 0;
    printf( "請輸入陣列長度: " );
    scanf("%d", &len);
    
    int arr[len];
    for ( int i=0; i<len; i++){
        scanf( "%d", &arr[i] );
        printf( "Array[%d]: %d\n", i, arr[i] );
    }
    
    int n = 5;
    int A[5]={ 3, 4, 1, 0, 2 };
    int p = A[0];
    int q = A[0];
    
    for (int i=1; i<n; i=i+1) {
        if (A[i] > p)
            p = A[i];
        if (A[i] < q)
            q = A[i];
    }
    
    printf( "P: %d\nN: %d", p, q );
}
