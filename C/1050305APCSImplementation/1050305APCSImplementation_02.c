//
//  main.c
//  1050305APCSImplementation_02
//
//  Created by Finley on 2019/10/23.
//  Copyright © 2019 Finley. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

int orig[10][10], R, C, M;

void rotate() {
    // insert code here...
    printf("rotate\n");
    int result[C][R];
    for( int i=0; i<R; i++) {
        for( int j=0; j<C; j++) {
            result[j][R-i-1] = orig[i][j];
        }
    }
    int temp = R;
    R = C;
    C = temp;
    // let orig=result;
    for( int i=0; i<R; i++) {
        for( int j=0; j<C; j++) {
            orig[i][j] = result[i][j];
        }
    }
}

void mirror() {
    // insert code here...
    printf("mirror\n");
    int result[R][C];
    for( int i=0; i<R; i++) {
        for( int j=0; j<C; j++) {
            result[R-i-1][j] = orig[i][j];
        }
    }

    // let orig=result;
    for( int i=0; i<R; i++) {
        for( int j=0; j<C; j++) {
            orig[i][j] = result[i][j];
        }
    }
}

int main(int argc, const char * argv[]) {
    // insert code here...
    int input1[3];
    
    // 第一列輸入參數
    printf( "依序輸入 Row, Column, Motion\n");
    for( int i=0; i<3; i++) {
        scanf( "%d", &input1[i]);
    }
    R = input1[0];
    C = input1[1];
    M = input1[2];
    int input2[M];
    
    // 第二列輸入陣列值
    for( int i=0; i<R; i++) {
        for( int j=0; j<C; j++) {
            scanf( "%d", &orig[i][j]);
        }
    }
    
    // 第三列輸入M次0旋轉1翻轉
    for( int i=0; i<M; i++) {
        scanf( "%d", &input2[i]);
    }
    //執行旋轉或翻轉
    for( int i=0; i<M; i++) {
        if (input2[i] == 0) rotate();
        else mirror();
    }
    
    printf("Row=%d, Column=%d\n", R, C);
    for( int i=0; i<R; i++) {
        for( int j=0; j<C; j++) {
            printf( "orig[%d][%d] = %d  ", i, j, orig[i][j]);
        }
        printf( "\n");
    }
}
