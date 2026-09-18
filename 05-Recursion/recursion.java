
//print number from 5 to 1
// public class recursion {
//     public static void printNum(int n){
//         if (n==0){
//             return;
//         }
//         else{
//             System.out.println(n);
//             printNum(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         int n=5;
//         printNum(n);
//     }
    
// }


//print number 1 to 5
// public class recursion {
//     public static void printNum(int n){
//         if (n==6){
//             return;
//         }
//         else{
//             System.out.println(n);
//             printNum(n+1);
//         }
//     }
//     public static void main(String[] args) {
//         int n=1;
//         printNum(n);
//     }
    
// }


// print sum of first n natural number
// public class recursion {
//     public static void printSum(int i,int n,int sum){
//         if(i==n){
//             sum+=i;
//             System.out.println(sum);
//             return;
//         }
//         sum+=i;
//         printSum(i+1, n, sum);
//     }
//     public static void main(String[] args) {
//         printSum(1, 4, 0 );
//     }
// }


//print factorial of a number n
// public class recursion {
// public static int printFactorial(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//         else{
//             return (n*printFactorial(n-1));
//         }
// }
// public static void main(String[] args){
//         int n=5;
//         int ans=printFactorial(n);
//         System.out.println(ans);
// }
// }


//print febonacci series till nth term
// public class recursion {
//     public static void printFib(int a,int b,int n){
//             if(n==0){
//              return;
//             }
//             int c=a+b;
//             System.out.println(c);
//             printFib(b, c, n-1);
//     }
//     public static void main(String[] args){
//             int a=0,b=1;
//             System.out.println(a);
//             System.out.println(b);
//             int n=7;
//             printFib(a, b, n-2);
//     }
//     }


//print x^n (stack height =n)
// 1. given will be x and n value
// 2. kaam calculating x^(n-1) the multiply it with x
// 3.base case 1.x^0=1 , 2.x=0 ,0
// public class recursion {
//         public static int calcPower(int x,int n){
//                 if(x==0){
//                         return 0; 
//                 }
//                 if(n==0){
//                         return 1;
//                 }
//                 int xpowernm1=calcPower(x, n-1);
//                 int xpowern= x*xpowernm1;
//                 return xpowern;
//         }
//         public static void main(String[] args){
//                 int ans=calcPower(2, 5);
//                 System.out.println(ans);
//         }
//         }

//print x^n (stack height =logn)
//uses less memory therefore is a more optimixed way
//kaam : x^n = x^(n/2) * x^(n/2) for even and x^n = x^(n/2) * x^(n/2) * x for odd
// public class recursion {
//         public static int calcPower(int x,int n){
//                 if(x==0){
//                         return 0; 
//                 }
//                 if(n==0){
//                         return 1;
//                 }  
//                 if(n%2==0){
//                         return calcPower(x,n/2)*calcPower(x,n/2);
//                 }
//                 else{
//                         return calcPower(x,n/2)*calcPower(x,n/2)*x;
//                 }
//         }
// public static void main(String[] args){
//                 int ans=calcPower(2, 5);
//                 System.out.println(ans);
//         }
// }


//tower of hanoi
// public class recursion {
//         public static void towerofhanoi(int n, String source, String helper ,String destiny  ){
//                 if(n==1){
//                         System.out.println("transfer disk "+n + "from "+source+"to"+ destiny);
//                         return;
//                 }
//                 towerofhanoi(n-1, source, destiny, helper);
//                 System.out.println("transfer disk "+n + "from "+source+"to"+ destiny);
//                 towerofhanoi(n-1, helper, source, destiny);
                
//         }
//         public static void main(String[] args) {
//                 int n=3;
//                 towerofhanoi(n,"source", "helper", "destiny");
//         }
// }


//print a index in reverse
// public class recursion {
//         public static void reverse(String str,int index){
//                 if(index==-1){
//                         return;
//                 }
//                 System.out.print(str.charAt(index));
//                 reverse(str,index-1);
//         }
//         public static void main(String[] args) {
//                 String str="abcdef";
//                 reverse(str, str.length()-1);
//         }
        
// }

//find first and last occurance of an element in a array
// public class recursion{
//         public static int first=-1;
//         public static int last=-1;
//         public static void findOccurance(String str, int idx , char element){
//                 if(idx==str.length()){
//                         System.out.println(first);
//                         System.out.println(last);
//                         return;
//                 }
//                 int currentchar=str.charAt(idx);
//                 if(currentchar==element){
//                         if(first==-1){
//                                 first=idx;
//                         }
//                         else{
//                                 last=idx;
//                         }
//                 }
//                 findOccurance(str, idx+1, element);
//         }
//         public static void main(String[] args) {
//                 String str="abaacdaefaah";
//                 findOccurance(str, 0, 'a');
//         }
// }


//check if an array is sorted i.e. strictly increasing 
// public class recursion{
//         public static boolean checkSorted(int[] arr,int idx){
//                 if(idx==arr.length-1){
//                         return true;
//                 }
//                 if(arr[idx]<arr[idx+1]){
//                         return  checkSorted(arr, idx+1);
//                 }
//                 else{
//                         return false;
//                 }
//         }
//         public static void main(String[] args) {
//                 int arr[]={1,2,3,9,5};
//                 System.out.println(checkSorted(arr, 0));
//         }
// }

//move all x at the end of the string
//axbcxxd->abcdxxx
// public class recursion{
//         public static void xatEnd(String str,int index,int count,String newstring){
//                 if(index==str.length()){
//                         for(int i=0;i<count;i++){
//                                 newstring+='x';
//                         }
//                         System.out.println(newstring);

//                         return;
//                 }
//                 char currentchar=str.charAt(index);
//                 if(currentchar=='x'){
//                         count++;
//                         xatEnd(str, index+1,count, newstring);
//                 }
//                 else{
//                         newstring+=currentchar;
//                         xatEnd(str, index+1, count, newstring);
//                 }
//         }
//         public static void main(String[] args) {
//                 String str="axbcxxd";
//                 xatEnd(str, 0, 0, "");
//         }
// }


//remove duplicates in a string
// public class recursion{
//         public static boolean[] map= new boolean[26];
//         public static void removeDup(int index,String str,String newString){
//                 if(index==str.length()){
//                     System.out.println(newString);
//                     return;
//                 }
//                 char currentchar=str.charAt(index);
//                 if(map[currentchar-'a']==true){
//                     removeDup( index +1, str, newString);
//                 }
//                 else{
//                     newString +=currentchar;
//                     map[currentchar-'a']=true;
//                     removeDup( index +1, str, newString);
//                 }
//         }
//         public static void main(String[] args) {
//             String str ="abbccda";
//             removeDup(0, str, "");
//         }
// }


//tose n coins print all possible combinations
// public class recursion{
//         public static void coincombo(int n ,String str){
//                 if (n == 0) 
//                 {
//                         System.out.println(str);
//                         return;
//                 }
//                     coincombo(n - 1, str + "H"); // Heads
//                     coincombo(n - 1,str + "T"); // Tails
//                 }
//         public static void main(String args[]){
//                 int n=3;
//                 coincombo(n,"");
//         }
// }



//print all the subsequence of strings
// public class recursion{
//     public static void subsequence(String str,int index,String newString){
//         if(index==str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char currentchar=str.charAt(index);

//         //to be
//         subsequence(str, index+1, newString+currentchar);
//         //not to be
//         subsequence(str, index+1, newString);
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         subsequence(str, 0, "");
//     }
// }


//print all the unique subsequence of strings
// import java.util.HashSet;
// public class recursion{
//     public static void subsequence(String str,int index,String newString,HashSet<String> set){
//         if(index==str.length()){
//             if(set.contains(newString)){
//                 return;
//             }
//             else{
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
            
//         }
//         char currentchar=str.charAt(index);
//         //to be
//         subsequence(str, index+1, newString+currentchar,set);
//         //not to be
//         subsequence(str, index+1, newString,set);
//     }
//     public static void main(String[] args) {
//         String str="aaa";
//         HashSet<String> set = new HashSet<>();
//         subsequence(str, 0, "",set);
//     }
// }


//peint keypad combination
// public class recursion{
//     public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yx"};
//     public static void printcomb(String str,int index,String combination){
//         if(index==str.length()){
//             System.out.println(combination);
//             return;
//         }
//         char currentchar=str.charAt(index);
//         String mapping=keypad[currentchar-'0'];
//         for(int i=0;i<mapping.length();i++){
//             printcomb(str, index+1, combination+mapping.charAt(i));
//         }
//     }
//     public static void main(String[] args) {
//         String str="23";
//         printcomb(str, 0,"");
//     }
// }


//print all permutations of a string 
// public class recursion{
//     public static void printperm(String str,String permutations){
//         if(str.length()==0){
//             System.out.println(permutations);
//             return;
//         }
        
//         for(int i=0;i<str.length();i++){
//             char currentchar=str.charAt(i);
//             String newString=str.substring(0, i)+str.substring(i+1);
//             printperm(newString, permutations+currentchar);
//         }
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         printperm(str, "");
//     }
// }


//count total path in a maze to move from 0,0 to n,m 
//movements allowed =right, down
// public class recursion{
//     public static int countpass(int i , int j , int n , int m ){
//         if(i==n-1 && j==n-1){
//             return 1;
//         }
//         if(i==n || j==m){
//             return 0;
//         }

//         //move downwards
//         int downpaths=countpass(i+1, j, n, m);
//         //move right
//         int rightpaths=countpass(i, j+1, n, m);

//         return downpaths+rightpaths;
//     }

//     public static void main(String[] args) {
//         int n=3 ,m=3;
//         int totalpaths= countpass(0,0,n,m);
//         System.out.println(totalpaths);
//     }
// }


//place tiles 1*m in a floor of size n*m
// public class recursion{
//     public static int placetiles(int n , int m ){
//         if(n==m){
//             return 2;
//         }
//         if(n<m){
//             return 1;
//         }
        
//         //place vertically
//         int vertical=placetiles(n-m, m);
//         //place horizontally
//         int horizontal=placetiles(n-1, m);
//         return vertical+horizontal;
//     }

//     public static void main(String[] args) {
//         int n=3, m=4;
//         System.out.println(placetiles(n, m));
//     }
// }


//find the no of ways in which you can invite n people to the party , singe or in pair
// public class recursion{
//     public static int guestcall(int n ){
//         if(n<=1){
//             return 1;
//         }
//         if (n==2) {
//             return 2;
//         }

//         //call single
//         int single= guestcall(n-1);

//         //call in pair
//         int pair=(n-1)*guestcall(n-2);
//         return single+pair;
//     }
//     public static void main(String[] args) {
//         int n =2;
//         System.out.println(guestcall(n));
//     }
// }


//print all the subsets of a set of first n natural numbers

import java.util.ArrayList;

public class recursion{
    public static void printsubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findsubset(int n , ArrayList<Integer> subset){
        if (n==0){
            printsubset(subset);
            return;
        }

        //add hoga
        subset.add(n);
        findsubset(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        findsubset(n-1, subset);
    }
        public static void main(String[] args) {
            int n=3;
            ArrayList<Integer> subset=new ArrayList<>();
            findsubset(n, subset);
        }
    }