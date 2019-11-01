//
//  main.c
//  1051029APCSconcept_12
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

int main() {
    int a = 5;
    // …
    for (int i=0; i<20; i=i+1){
        i = i + a;
        printf ("%d ", i);
    }
}