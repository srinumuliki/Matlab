#include<stdio.h>
void BubbleSort(int A[], int n){
    int cnt = 0,i,j;
    for(i = 0 ; i < n - 1 ; i++){
        int flage = 0;
        for(j = 0 ; j < n- i -1 ; j++){
            cnt++;
            if(A[j] > A[j+1]){
                int temp = A[j+1];
                A[j+1] = A[j];
                A[j] = temp;
                flage = 1;
            }
        }
        if(flage == 0){
            break;
        }
    }
    printf("How many times swaping count: %d\n",cnt);
}
int main(){
    int n,i;
    printf("Enter the size of an array: ");
    scanf("%d", &n);
    int A[n];
    printf("Enter Unsorted array: ");
    for(i=0; i<n; i++){
        scanf("%d", &A[i]);
    }
    BubbleSort(A,n);
	printf("Sorted elements are(Using Bubble sort): "); 
    for(i = 0 ; i < n ; i++){
        printf("%d ", A[i]);
    }
}
