//
//  main.c
//  1060304APCSconcept_20
//
//  Created by Finley on 2019/10/25.
//  Copyright © 2019 Finley. All rights reserved.
//
#include <stdio.h>
#include <stdlib.h>

int g1 = 30, g2 = 20;

int f1( int v ) {
    int g1 = 10;
    return g1+v;
}

int f2( int v ) {
    int c = g2;
    v = v+c+g1;
    g1 = 10;
    c = 40;
    return v;
}

int main(void)
{
    g2 = 0;
    g2 = f1(g2);
    printf( "%d", f2(f2(g2)) );
}
