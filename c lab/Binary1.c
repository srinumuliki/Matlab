#include <stdio.h>
int binarySearchNonRecursive(int arr[], int n, int key) {
 int low = 0, high = n - 1;
 while (low < high) {
 int mid = low + (high - low) / 2; 
 if (arr[mid] == key)
 return mid; 
 else if (arr[mid] < key)
 low = mid + 1; 
 else
 high = mid - 1; 
 }
 return -1; 
}
int binarySearchRecursive(int arr[], int key, int low, int high) {
 if (low > high){
 return -1; 
 }
 int mid = low + (high - low) / 2;
 if (arr[mid] == key){
 return mid;
 }
 else if (arr[mid] < key){
 return binarySearchRecursive(arr, key, mid + 1, high); 
 }else{
 return binarySearchRecursive(arr, key, low, mid - 1); 
 }
}
int main() {
 int n, key,i;
 printf("Enter size of array: ");
 scanf("%d", &n);
 int arr[n];
 printf("Enter elements to the array ", n);
 for (i = 0; i < n; i++) {
 scanf("%d", &arr[i]);
 }
 printf("Enter the key element ");
 scanf("%d", &key);
 int result_non_recursive = binarySearchNonRecursive(arr, n, key);
 if (result_non_recursive != -1) {
 printf("%d Key element is found  %d\n",key,result_non_recursive);
 } else {
 printf("Key %d not found \n", key);
 }
 int result_recursive = binarySearchRecursive(arr, key, 0, n - 1);
 if (result_recursive != -1) {
 printf("%d Key element is found %d\n",key,result_recursive);
 } else {
 printf("Key %d not found \n", key);
 }
 return 0;
}

