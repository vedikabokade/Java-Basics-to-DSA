//1.
// import java.util.Scanner;
// public class functions {
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         String name=sc.next();
//         printMyName(name);
//     }
// }

//2. make a function to add two numbers and return the sum
// import java.util.Scanner;
// public class functions {
//     public static void calculateSum(int n1,int n2){
//         System.out.println(n1+n2);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         calculateSum(a,b);
//     }
// }

//3.find factorial using function
import java.util.Scanner;
// public class functions {
//     public static void calculateFactorial(int n){
//         int fact=1;
//         for(int i=1;i<=n;i++){
//         fact=fact*i;
//         }
//         System.out.println(fact);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         calculateFactorial(n);
//     }
// }

//4.fibonacci series of n terms

public class functions {
    public static void fibonacciSeriesPrint(int n){
        
        for(int i=0;i<=n;i++){
            int sum=0;
        sum=sum+i;
        System.out.println(sum);
        }
        
        return;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        fibonacciSeriesPrint(n);
    }
}



