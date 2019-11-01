//
//  main.c
//  1051029APCSconcept_09
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
    for ( int s=51; s<100; s++) {
        
        if ( (s%10)==0 )    printf("\n");
        
        if (s>=90)  printf ("A ");
        else if (s>=80) printf ("B ");
        else if (s>60)  printf ("D ");
        else if (s>70)  printf ("C ");
        else    printf ("F ");
        
    }
}