//
//  main.c
//  1060304APCSconcept_15
//
//  Created by Finley on 2019/11/01.
//  Copyright © 2019 Finley. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

void F (int a) {
    while (a < 10) {
        a = a + 5;
        printf( "run: a = a + 5;\n" );
    }
    
    if (a < 12) {
        a = a + 2;
        printf( "run: a = a + 2;\n" );
    }
    if (a <= 11) {
        a = 5;
        printf( "run: a = 5;" );
    }
    
    // 輸出結果
    printf( "%d", a);
}


int Return() {
    return 0;
}

int main()
{
    F(11);
}