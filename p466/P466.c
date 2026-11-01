#include <stdio.h>
#define N 4

int main(void){
    int data[N] = {5, 3, 8, 1};
    int i, temp;

    temp = data[0];                 

    for (i = 0; i < N - 1; ++i) {  
        data[i] = data[i + 1];
    }

    data[N - 1] = temp;            

    for (i = 0; i < N; ++i) {
        printf("%d ", data[i]);
    }
    printf("\n");

    return 0;
}

// cd P466
// gcc -o P466 ./P466.c
// ./P466