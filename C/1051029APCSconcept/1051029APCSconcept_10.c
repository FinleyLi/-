//
//  main.c
//  1051029APCSconcept_10
//
//  Created by Finley on 2019/11/01.
//  Copyright © 2019 Finley. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

int K (int p[], int v) {
    if (p[v]!=v) {
        p[v] = K(p, p[v]);
    }
    return p[v];
}

void G (int p[], int l, int r) {
    int a=K(p, l), b=K(p, r);
    if (a!=b) {
        p[b] = a;
    }
}

int main (void) {
    int p[5]={0, 1, 2, 3, 4};
    G(p, 0, 1);
    G(p, 2, 4);
    G(p, 0, 4);
    
    int count = 0;
    for( int i=0; i<5; i++) {
        printf( "%d ", p[i]);
        if (p[i]==0) count++;
    }
    printf("\n 0 have: %d", count);
    
    return 0;
}
