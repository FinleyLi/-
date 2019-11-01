//
//  main.c
//  1051029APCSconcept_02
//
//  Created by Finley on 2019/11/01.
//  Copyright © 2019 Finley. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

void Fswitch( int x) {
    char y[1];
    
    switch (x) {
        case 10: y[0] = 'a'; break;
        case 20:
        case 30: y[0] = 'b'; break;
        default: y[0] = 'c';
    }
    
    printf("switch: %c\n", y[0]);
}

void Fif( int x) {
    char y[1];
    
    if (x==10) y[0] = 'a';
    else if (x==20 || x==30) y[0] = 'b';
    else y[0] = 'c';
    
    printf("if else: %c\n", y[0]);
}


int Return (int x, int y) {
    return 0;
}

int main()
{
    int x;
    printf( "輸入10, 20, 30, ...任一整數: " );
    scanf( "%d", &x);
    Fswitch(x);
    Fif(x);
}