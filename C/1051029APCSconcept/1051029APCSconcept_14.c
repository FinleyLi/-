//
//  main.c
//  1051029APCSconcept_14
//
//  Created by Finley on 2019/11/01.
//  Copyright © 2019 Finley. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

/*
#include < stdbool.h >
*/
typedef unsigned int bool;
#define FALSE 0
#define TRUE 1

bool x = TRUE;
bool y = TRUE;
bool z = FALSE;

void noReturn( int x) {
    
}

int Return (int x, int y) {
    return 0;
}

int main() {
    printf ("%d ", !(y || z) || x);
    printf ("%d ", !y || (z || !x));
    printf ("%d ", z || (x && (y || z)));
    printf ("%d ", (x || x) && z);
}