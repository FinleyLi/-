//
//  main.c
//  1060304APCSconcept_17
//
//  Created by Finley on 2019/11/01.
//  Copyright © 2019 Finley. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

void noReturn (int a) {
    // no Return
}


int F (int n) {
    int x = 0;
    
    for (int i=1; i<=n; i=i+1)
        for (int j=i; j<=n; j=j+1)
            for (int k=1; k<=n; k=k*2)
                x = x + 1;
    return x;
}

int main()
{
    printf( "Ans = %d", F(78));
}