#include<stdio.h>
void Merge(int A[], int l , int m, int r){
    int i, j, k;
    i = l;
    j = m + 1;
    k = 0;
    int B[r+1];
    while(i <= m && j <= r){
        if(A[i] < A[j]){
            B[k++] = A[i++];
        }
        else{
            B[k++] = A[j++];
        }
    }
    while(i <= m){
        B[k++] = A[i++];
    }
    while(j <= r){
        B[k++] = A[j++];
    }
    for(i = l, k = 0 ; i <= r ; i++, k++){
        A[i] = B[k];
    }
}
void MergeSort(int A[], int l, int r){
    if(l < r){
        int m = (l + r) / 2;
        MergeSort(A, l , m);
        MergeSort(A, m + 1, r);
        Merge(A, l, m, r); 
    }
}
int main(){
    int n,i;
    printf("Enter size of an array: ");
    scanf("%d", &n);
    int A[n];
    printf("Enter Unsorted elements: ");
    for(i=0; i<n; i++){
        scanf("%d", &A[i]);
    }
    MergeSort(A,0,n-1);
    printf("Sorted elements (Using Merge sort)are: ");
    for(i = 0 ; i < n ; i++){
        printf("%d ", A[i]);
    }
}
