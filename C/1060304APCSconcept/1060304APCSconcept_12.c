//
//  main.c
//  1060304APCSconcept_12
//
//  Created by Finley on 2019/10/25.
//  Copyright © 2019 Finley. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void noReturn() {
    
}

int Return() {
    return 0;
}

int main()
{
    int i;
    unsigned seed;
    seed = (unsigned)time(NULL); // 取得時間序列
    srand(seed); // 以時間序列當亂數種子
    /*for(i=0; i<5; ++i)
        printf("%d ", rand());
    getchar();*/
    
    printf( "A: %d\n", rand() % 900 + 100);
    printf( "B: %d\n", rand() % 1000 + 1);
    printf( "C: %d\n", rand() % 899 + 101);
    printf( "D: %d\n", rand() % 901 + 100);
    
}
