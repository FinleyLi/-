//
//  main.c
//  1060304APCSconcept_14
//
//  Created by Finley on 2019/10/25.
//  Copyright © 2019 Finley. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int Line = 0;

void F (int n) {
    Line++;
    printf ("Line %d: %d\n", Line, n);
    if ((n%2 == 1) && (n > 1)){
        return F(5*n+1);
    }
    else {
    if (n%2 == 0)
        return F(n/2);
    }
}

int Return() {
    return 0;
}

int main()
{
    F(15);
}
