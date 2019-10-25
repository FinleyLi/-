//
//  main.c
//  1060304APCSconcept_19
//
//  Created by Finley on 2019/10/25.
//  Copyright © 2019 Finley. All rights reserved.
//
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int M = -1, N = 101, s = 3;
    int A[] = {80, 90, 100};
    for (int i=0; i<s; i=i+1) {
        if (A[i]>M) {
            M = A[i];
        }
        //else 
        if (A[i]<N) {
            N = A[i];
        }
    }
    printf("M = %d, N = %d\n", M, N);
}
