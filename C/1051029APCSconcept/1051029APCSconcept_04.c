//
//  main.c
//  1051029APCSconcept_04
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
    int a=2, b=3;
    int c=4, d=5;
    int val;
    val = b/a + c/b + d/b;
    printf ("%d\n", val);
}