//
//  main.c
//  Problem: 1050305APCSImplementation_01
//  Author: Finley
//
//  Created by Finley on 2019/10/23.
//  Copyright © 2019 Finley. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

int over60, under60;

// 排序法
int cmp(const void * a, const void * b){
    return (   *(int*)a   -  *(int*)b  );
}

int main(int argc, const char * argv[]) {
    // insert code here...
    // 第一列輸入學生人數
    int student;
    printf( "輸入學生人數：");
    scanf( "%d", &student);
    
    // 第二列輸入學生成績以空白間隔
    int score[student];
    printf("輸入學生成績：");
    for( int i=0; i<student; i++) {
        scanf( "%d", &score[i]);
    }
    
    // 快速排序法
    qsort( score, student, sizeof(int), cmp);
    // 列印成績
    for( int i=0; i<student; i++) {
        printf( "%d ", score[i]);
    }
    printf("\n");
    
    // search <60 max
    if ( score[0] >= 60) {
        printf( "\nbest case\n");
    } else{
        for( int i=0; i<student; i++) {//由前往後找小於60的最大數
            if (score[i]<60) under60 = score[i];
        }
        printf( "小於60最大值：%d\n", under60);
    }
    
    // search >60 min
    if ( score[student] < 60) {
        printf( "\nworst case\n" );
    } else{
        for( int i=student-1; i>=0; i--){//由後往前找大於等於60的最小數
            if ( score[i]>=60) over60=score[i];
        }
        printf( "大於60最小值：%d\n", over60);
    }
    
    // return 0;
}
