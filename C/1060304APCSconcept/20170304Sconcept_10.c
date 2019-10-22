/**********************************************************************************
 *  Problem: 2017/03/04 "Sconcept 10" from APCS                                      
 *  Language: C                                                                                                   
 *  Author: Finley at 2019-10-22 16:42                                      
 **********************************************************************************/

#include <stdio.h>

// Return value
int Finley(){
    // code goes here
    return 9527;
}

int n = 0;
// no Return value
int K (int b) {
    n = n + 1;
    if (b % 4)
        K(b+1);
    return n;
}
void G (int m) {
    for (int i=0; i<m; i=i+1) {
        printf("K(%d) = %d\n", i, K(i));
    }
}

int main(void)
{
    int N;
    printf("input: ");
    scanf( "%d", &N);
    G(N);
}