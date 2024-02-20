#include <stdio.h>
int linearSearchNonRecursive(int arr[], int n, int key) {
 int i;
 for (i = 0; i < n; i++) {
 if (arr[i] == key)
 return i; 
 }
 return -1; 
}
int linearSearchRecursive(int arr[], int key, int index, int n) {
 if (index >= n)
 return -1; 
 if (arr[index] == key)
 return index; 
 return linearSearchRecursive(arr, key, index + 1, n); 
}
int main() {
 int n,i,key;
 printf("Enter the number of elements in the list: ");
 scanf("%d", &n);
 int arr[n];
 printf("Enter %d elements: ", n);
 for (i = 0; i < n; i++) {
 scanf("%d", &arr[i]);
 }
 printf("Enter the key value to search: ");
 scanf("%d", &key);
 int result_non_recursive = linearSearchNonRecursive(arr, n, key);
 if (result_non_recursive != -1) {
 printf("Key %d found at index %d (non-recursive).\n", key, result_non_recursive);
 } else {
 printf("Key %d not found (non-recursive).\n", key);
 }
 int result_recursive = linearSearchRecursive(arr, key, 0, n);
 if (result_recursive != -1) {
 printf("Key %d found at index %d (recursive).\n", key, result_recursive);
 } else {
 printf("Key %d not found (recursive).\n", key);
 }
return 0;
}

