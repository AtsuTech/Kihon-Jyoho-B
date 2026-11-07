#include <stdio.h>
#define N 6

void swap(int a[], int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}

int main(void){
    int data[N] = {5, 3, 8, 1, 4, 10};
    int i, pass;

    for (pass = 0; pass < N - 1; ++pass) {
        for (i = 0; i < N - 1 - pass; ++i) {
            if (data[i] > data[i + 1]) {
                swap(data, i, i + 1);
            }
        }
    }

    for (i = 0; i < N; ++i) {
        printf("%d ", data[i]);
    }
    printf("\n");

    return 0;
}

// cd sort
// gcc -o bubleSort ./bubleSort.c
// ./bubleSort