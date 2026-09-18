// public class sort {

//     public static void printarray(int arr[]){
//         for(int i=0;i<=arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }

//bubble sort
    // public static void main(String[] args) {
    //     int arr[]={7,8,3,1,2};
    //     //bubble sort
    //     for(int i=0;i<=arr.length;i++){
    //         for(int j=0;j<=arr.length-i-1;j++){
    //             if(arr[i]>arr[i+1]){
    //                 //swap
    //                 int temp=arr[i];
    //                 arr[i]=arr[i+1];
    //                 arr[i+1]=temp;
    //             }
    //         }
    //     printarray(arr);
    //     }
    // }
    

//selection sort
// public static void main(String[] args) {
//     int arr[]={7,8,3,1,2};
//     for(int i=0;i<arr.length;i++){
//         int smallest=i;
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[smallest]>arr[j]){
//                 smallest=j;
//             }
//         }
//         int temp=arr[smallest];
//         arr[smallest]=arr[i];
//         arr[i]=temp;
//     }
//     printarray(arr);
// }
// }


//insertion sort
// public static void main(String[] args) {
//     int arr[]={7,8,3,1,2};
//     for(int i =1;i< arr.length ;i++){
//         int current =arr[i];
//         int j=i-1;
//         while( j>= 0 && current < arr[j]){
//             arr[j+1]=arr[i];
//             j--;
//         }
//         arr[j+1]=current;
//     }
//     printarray(arr);
// }


//merge sort 
public class sort { 
public static void conquor(int arr[],int si,int mid,int ei) {
    int merge[] =new int[ei-si+1]  ;
    int idx1=si;
    int idx2=mid+1;
    int x=0;
    while(idx1<=mid&&idx2<=ei){
        if(arr[idx1]<=arr[idx2]){
            merge[x++]=arr[idx1++];
        }
        else{
            merge[x++]=arr[idx2++];
        }
        
    }
    while(idx1<=mid){
        merge[x++]=arr[idx1++];
    }
    while(idx2<=ei){
        merge[x++]=arr[idx2++];
    }
    for(int i=0, j=si ;  i<merge.length ; i++ , j++){
        arr[j]=merge[i];
    }
}
public static void divide(int arr[], int si,int ei){
    if(si>=ei){
        return;
    }
    int mid=si+ (ei-si)/2;
    divide(arr, si, mid);
    divide(arr, mid+1, ei);
    conquor(arr , si,mid,ei);
}
public static void main(String[] args) {
    int arr[]={6,3,9,5,2,8};
    int n=arr.length;
    divide(arr, 0, n-1);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
}


//quick sort

// import java.util.Arrays;
// public class sort {
//     static void quicksort(int arr[], int low, int high) {
//         if (low < high) {
//             int pi = partition(arr, low, high);
//             quicksort(arr, low, pi - 1);
//             quicksort(arr, pi + 1, high);
//         }
//     }

//     static int partition(int arr[], int low, int high) {
//         int pivot = arr[high];
//         int i = low - 1;

//         for (int j = low; j < high; j++) {
//             if (arr[j] <= pivot) {
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         i++;
//         int temp = arr[i];
//         arr[i] = pivot;
//         arr[high] = temp;
//         return i;
//     }
//     public static void main(String[] args) {
//         int arr[] = {10, 7, 8, 9, 1, 5};
//         int n = arr.length;
//         System.out.println("Before Quick Sort: " + Arrays.toString(arr));
//         quicksort(arr, 0, n - 1);
//         System.out.println("After Quick Sort: " + Arrays.toString(arr));
//     }
// }