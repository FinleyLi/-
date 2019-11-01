//
//  main.c
//  1051029APCSconcept_05
//
//  Created by Finley on 2019/11/01.
//  Copyright © 2019 Finley. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

void noReturn( int x) {
    
}

int Return (int x, int y) {
    return 0;
}

int main()
{
    int a[9] = {1, 3, 5, 7, 9, 8, 6, 4, 2};
    int n=9, tmp;
    for (int i=0; i<n; i=i+1) {
        tmp = a[i];
        a[i] = a[n-i-1];
        a[n-i-1] = tmp;
    }
    for (int i=0; i<=n/2; i=i+1)
        printf ("%d %d ", a[i], a[n-i-1]);
}