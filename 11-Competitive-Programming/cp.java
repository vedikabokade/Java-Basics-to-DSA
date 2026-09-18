
// prefix sum


//find subarrays of a given array

//find maximum number of subarrays

//find sum of all the subarrays


//product of array except self
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
// public class cp{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4};
//         int n=arr.length;
//         // int[] left= new int[arr.length];
//         // int[] right= new int[arr.length];
//         // int[] ans= new int[arr.length];

//         // //to calculate left product
//         // left[0]=1;
//         // for(int i=1;i<arr.length;i++){
//         //     left[i]=left[i-1]*arr[i-1];
//         // }

//         // //to calculate right product
//         // right[0]=1;
//         // for(int i=arr.length;i>)

        
//         for(int i=0;i<n;i++){
//             int x=1;
//             for(int j=0;j<i;j++){
//                 x*=arr[j];
//             }
//             int y=1;
//             for(int k=n-1;k>i;k--){
//                 y*=arr[k];
                
//             }
//             int ans=x*y;
//             System.out.println(ans);
//         }
        
//     }
// }


//max sum  of subarray of size k
// public class cp{
//     public static void main(String[] args) {
        
        //way 1
        // int arr[]={100,200,300,400};
        // int n=arr.length;
        // int k=2;
        // int ans=0;
        // for(int i=0;i<=n-k;i++){
        //     int sum =0;
        //     for(int j=0;j<k;j++){
        //         sum+=arr[i+j];
        //     }
        //     if(sum>ans){
        //         ans =sum;
                
        //     }
        // }System.out.println(ans);
        //}}

        //way 2
//         public class cp{
//         public static int max_sum_of_subarray(int arr[], int n, int k)
//         {
//             int max_sum = 0;
//             for (int i = 0; i + k <= n; i++) {
//             int temp = 0;
//             for (int j = i; j < i + k; j++) {
//             temp += arr[j];
//             }
//             if (temp > max_sum){
//             max_sum = temp;
//             }
//             }
//             return max_sum;
//             }
//     public static void main(String args){
//     int arr[] = { 100,200,300,400 };
//     int k = 2;
//     int n = arr.length;
//     int max_sum;
//     max_sum = max_sum_of_subarray(arr, n, k);
//     System.out.println(max_sum);
// }
// }


//two sum
//way 1
// public class cp{
//     public static void main(String[] args) {
//         int arr[]={2,7,7,1};
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             for(int j =i+1;j<n;j++){
//                 if(arr[i]+arr[j]==9){
//                     System.out.println("["+i+","+j+"]");
//                 }
//             }
//         }
//     }
// }
//way 2
// public class cp{
//     public int[] twosum(int[] arr,int target){
//         int[] ans=new int[2];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     ans[0]=i;
//                     ans[1]=j;
//     }
//     return ans;
// }
//         }
//     public static void main (String args) {
//         int arr[]={2,7,11,15};
//         twosum(arr, 9);
//     }
// }
// }

//278


//floornumber
// public class cp{
//     public static void main(String[] args) {
//         int arr[]={8,16,22,48,54,63};
//         int target=36;
//         int n=arr.length;
//         for(int i=n-1;i>=0;i--){
//             if(arr[i]<target){
//                 System.out.println(arr[i]);
//                 break;
//             }
//         }
//     }
// }

//binary search
//coding verse


//principle of mathematical induction
//1.check for smaller values
//k
//k+1 

// public class cp{
//     public static void printn(int n){
//         if(n==0){
//             return;
//         }
//         else{
//         System.out.println(n);
//         printn(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         int n=5;
//         printn(n);
//     }
// }


// public class cp{
//         public static int  factorial(int n){
//             if(n==0 || n==1){
//                 return 1;
//             }
//             else{
//             return (n*factorial(n-1));
//             }
//         }
//         public static void main(String[] args) {
//             int n=7;
//             int fact =factorial(n);
//             System.out.println(fact);
//         }
//     }


// public class cp {
//     public static void printFib(int a,int b,int n){
//         if(n==0){
//         return;
//         }
//         int c=a+b;
//         System.out.println(c);
//         printFib(b, c, n-1);
//         }
//         public static void main(String[] args){
//                 int a=0,b=1;
//             System.out.println(a);
//             System.out.println(b);
//             int n=7;
//             printFib(a, b, n-2);
//     }
//     }


    //
//         class cp {
//         public static void generateParantheses(int open,int close,int n ,String com ){
//                 if(open==n && close==n){
//                 System.out.print(com+" ");
//                 }
//                 if(open<n){
//                 generateParantheses(open+1,close,n,com+"(");
//                 }
//                 if(close<n){
//                 generateParantheses(open,close+1,n,com+")");
//                 }
//         }
//         public static void main(String[] args) {
//                 generateParantheses(0,0,3," ");
//         }
//  }

// public class cp {
//         public static void  backtr(int tq,int qtsf,String comb,boolean[] chair){ //queen placed si far
//                 if(tq==qtsf){
//                         System.out.println(comb);
//                         return;
//                 }
//                 for (int i=0;i<chair.length;i++){
//                         if(chair[i]==false){
//                                 chair[i]=true;
//                                 backtr(tq, qtsf+1, comb+'c'+i+'q'+qtsf, chair);
//                                 chair[i]=false;
//                         }
//                 }
//         }
//         public static void main(String[] args) {
//                 int n=4;
//                 int q=2;
//                 boolean[] chair=new boolean[n];
//                 backtr(2, 0, " ", chair);
//         }
// }


// public class cp {
//         public static void subsequence(String str,int idx,String subs){
//                 if(idx==str.length()){
//                         System.out.println(subs);
//                         return;
//                 }
//                 subsequence(str, idx+1, subs+str.charAt(idx));
//                 subsequence(str, idx+1, subs);
//         }
//                 public static void main(String[] args) {
//                 subsequence("abcd", 0, "");
//         }
// }


//

import java.util.ArrayList;
import java.util.List;

public class cp {
       public List<List<Integer>> ans= new ArrayList<>() ;
        public List<List<Integer>> combine(int n,int k){
                comb(1, n, k,new ArrayList<>());
                return ans;
        }  
        public static void comb(int curr , int n,int k, List<Integer> list){
                if(list.size()==k){
                        ans.add(new ArrayList<>(list));
                        return;
                }
                for(int i=curr;i<=n;i++){
                        list.add(i);
                        comb(i+1, n, k, list);
                        list.remove(list.size()-1);
                }
        }
}