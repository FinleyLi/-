//
//  main.c
//  1060304APCSconcept_18
//
//  Created by Finley on 2019/10/25.
//  Copyright © 2019 Finley. All rights reserved.
//
#include <stdio.h>

int main()
{
    int x = 0, n = 5;
    for (int i=1; i<=n; i=i+1)
        for (int j=1; j<=n; j=j+1) {
            if ((i+j)==2) {
                x = x + 2;
                printf("[%d][%d]+2\n", i, j);
            }
            if ((i+j)==3) {
                x = x + 3;
                printf("[%d][%d]+3\n", i, j);
            }
            if ((i+j)==4) {
                x = x + 4;
                printf("[%d][%d]+4\n", i, j);
            }
     }
     printf ("%d\n", x);


    return 0;
}
