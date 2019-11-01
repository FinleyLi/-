//
//  main.c
//  1060304APCSconcept_16
//
//  Created by Finley on 2019/11/01.
//  Copyright © 2019 Finley. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

void F (int a) {
    // no Return
}


int Fa (int a) {
    if ( a % 2 != 1 )
        return a * 2 + 3;
    else
        return a * 3 + 1;
}

int Fb (int a) {
    if ( a * 2 > 16 )
        return a * 2 + 3;
    else
        return a * 3 + 1;
}

int Fc (int a) {
    if ( a + 3 < 12 )
        return a * 2 + 3;
    else
        return a * 3 + 1;
}

int Fd (int a) {
    if ( a * a < 50 )
        return a * 2 + 3;
    else
        return a * 3 + 1;
}

int main()
{
    F(78);
    printf( "A: F(7) = %d, F(8) = %d\n", Fa(7), Fa(8));
    printf( "B: F(7) = %d, F(8) = %d\n", Fb(7), Fb(8));
    printf( "C: F(7) = %d, F(8) = %d\n", Fc(7), Fc(8));
    printf( "D: F(7) = %d, F(8) = %d\n", Fd(7), Fd(8));
}