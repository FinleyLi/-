//
//  main.c
//  1060304APCSconcept_13
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
    int count = 0;
    printf ("Q:");
    for (int i=0; i<=100; i=i+5) {
        count++;
        printf ("%s ", "Hi!");
    }
    printf("%d\n", count);
    
    count = 0;
    printf ("A:");
    for (int i=0; i<20; i=i+1) {
        count++;
        printf ("%s ", "Hi!");
    }
    printf("%d\n", count);
    
    count = 0;
    printf ("B:");
    for (int i=5; i<=100; i=i+5) {
        count++;
        printf ("%s ", "Hi!");
    }
    printf("%d\n", count);
    
    count = 0;
    printf ("C:");
    for (int i=0; i<100; i=i+5) {
        count++;
        printf ("%s ", "Hi!");
    }
    printf("%d\n", count);
    
    count = 0;
    printf ("D:");
    for (int i=5; i<100; i=i+5) {
        count++;
        printf ("%s ", "Hi!");
    }
    printf("%d\n", count);
}
