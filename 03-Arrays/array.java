//1D

//taking inputs from user and printing them
// import java.util.Scanner;
// public class array {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n =sc.nextInt();
//         int marks[]=new int[n];
//         for(int i=0;i<n;i++){
//             marks[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             System.out.println(marks[i]);
//     }
// }
// }

//take an array as input from the user and search for a given number and print the index at which it occurs
// import java.util.Scanner;
// public class array {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n =sc.nextInt();
//         int marks[]=new int[n];
//         for(int i=0;i<n;i++){
//             marks[i]=sc.nextInt();
//         }
//         int x=sc.nextInt();
//         for(int i=0;i<n;i++){
//             if (marks[i]==x) {
//                 System.out.println("index of "+ x + " is " + i);
//             }
//         }
// }
// }

//finding the lowest number in the array
// public class array {
//     public static void min(int arr[]){
//         int min=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(min>arr[i]){
//                 min=arr[i];
//             } 
//         }
//     System.out.println(min);
//     }
//     public static void main(String[] args) {
//         int arr[]={21,15,49,36,63,17,10} ;
//         min(arr);
//     }
// }

//reversing of array
// public class array {
//     public static void reverse(int arr[]){
//         for(int i=arr.length-1;i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={21,15,49,36,63,17,10} ;
//         reverse(arr);
//     }
// }


//2D

//taking inputs from user and printing them
// import java.util.Scanner;
// public class array {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int row=sc.nextInt();
//         int column=sc.nextInt();
//         int matrix[][]=new int[row][column];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<column;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<row;i++){
//             for(int j=0;j<column;j++){
//                 System.out.print(" "+matrix[i][j]+" ");
//             }
//             System.out.println();
//     }
// }
// }

//take a matrix as an input from the user anf search a given number x and print the indices
// import java.util.Scanner;
// public class array {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter no of rows");
//         int row=sc.nextInt();
//         System.out.println("enter no of columns");
//         int column=sc.nextInt();
//         int matrix[][]=new int[row][column];
//         System.out.println("enter the elements");
//         for(int i=0;i<row;i++){
//             for(int j=0;j<column;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("enter the number to be found");
//         int x=sc.nextInt();
//         for(int i=0;i<row;i++){
//             for(int j=0;j<column;j++){
//             if (matrix[i][j]==x) {
//                 System.out.println("index of "+ x + " is " + i + ","+j);
//             }}
//         }
//     }
// }

//print in spiral order
//1  8  7  9  10  11
//6  10 12 13 20  21
//9  25 29 30 32  41
//15 55 59 63 68  70
//40 70 79 81 95 105
// import java.util.Scanner;
// public class array{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter no of rows");
//         int row=sc.nextInt();
//         System.out.println("enter no of columns");
//         int column=sc.nextInt();
//         int matrix[][]=new int[row][column];
//         System.out.println("enter the elements");
//         for(int i=0;i<row;i++){
//             for(int j=0;j<column;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         int rowStart = 0;
//         int rowEnd = row-1;
//         int colStart = 0;
//         int colEnd = column-1;
//         while(rowStart<=rowEnd && colStart<=colEnd){
//             for(int c=colStart;c<=colEnd;c++){
//                 System.out.println(matrix[rowStart][c]);
//             }
//             rowStart++;
//             for(int r=rowStart;r<=rowEnd;r++){
//                 System.out.println(matrix[r][colEnd]);
//             }
//             colEnd--;
//             for(int c=colEnd;c>=colStart;c--){
//                 System.out.println(matrix[rowEnd][c]);
//             }
//             rowEnd--;
//             for(int r=rowEnd;r>=rowStart;r--){
//                 System.out.println(matrix[r][colStart]);
//             }
//             colStart++;
//             System.out.println();
//         }
//     } 
// }

//for a given matrix print its transpose
// 1 6 2    00 01 02
// 2 5 1    10 11 12
// 3 8 6    20 21 22
// 4 1 0    30 31 32
// import java.util.Scanner;
// public class array {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter n row");
//         int n = sc.nextInt();
//         System.out.println("enter m column");
//         int m = sc.nextInt();
//         int matrix[][] = new int[n][m];
//         System.out.println("enter elements");
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("matrix is");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(" "+matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println("The transpose is : ");
//        //To print transpose
//         for(int i=0; i<m ;i++) {
//             for(int j=0; j<n; j++) {
//                 System.out.print(matrix[j][i]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//print in zigzag manner 
//1  2  3  4  5
//6  7  8  9  10
//11 12 13 14 15
//16 17 18 19 20
// ans : 1 6 11 16 17 12 7 2 3 8 13 18 .....
public class array{
    public static void print(int arr[][]){
        int row=arr.length;
        int col= arr[0].length;
        for(int j=0;j<=col;j++){
            if (j%2==0){
                for(int i=0;i<=row;i++){
                    System.out.print(arr[i][j]);
                }}
            else{
                for(int i=row;i<=0;i--){
                    System.out.print(arr[i][j]);
            }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        print(arr);
}}