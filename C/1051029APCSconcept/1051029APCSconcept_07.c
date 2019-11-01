//
//  main.c
//  1051029APCSconcept_07
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
    int a=0, n;
    
    printf( "輸入n: " );
    scanf( "%d", &n);

    for (int i=1; i<=n; i=i+1)
        for (int j=i; j<=n; j=j+1)
            for (int k=1; k<=n; k=k+1)
                a = a + 1;

    printf( "輸出a = %d", a );
}
