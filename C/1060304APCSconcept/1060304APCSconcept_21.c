//
//  main.c
//  1060304APCSconcept_21
//
//  Created by Finley on 2019/11/01.
//  Copyright © 2019 Finley. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

void noReturn (int a) {
    // no Return
}


int F (int x, int y) {
    if (x<1)
        return 1;
    else
        return F( x-y, y) + F( x-2*y ,y );
}

int main()
{
    printf( "Ans = %d", F( 5, 2) );
}