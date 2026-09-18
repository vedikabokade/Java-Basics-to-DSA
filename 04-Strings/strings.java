// import java.util.Scanner;
// public class strings {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter name");
//         String name= sc.nextLine();
//         System.out.println("name is " + name);
// }
// }

//concatenation
// public class strings {
//     public static void main(String args[]) {
//         String firstname="vedika";
//         String lastname="bokade";
//         String fullname= firstname + " "+ lastname;
//         System.out.println(fullname);
//         //printing length
//         System.out.println(fullname.length());
//         //charAt : for printing string character one by one
//         for(int i=0;i<fullname.length();i++){
//             System.out.println(fullname.charAt(i));
//         }
// }
// }

//comparing strings
// public class strings {
//     public static void main(String args[]) {
//         String a="vedika";
//         String b="vedika";
//         //a>b:positive value
//         //a<b:negative value
//         //a=b:value 0
//         if(a.compareTo(b)==0){
//             System.out.println("strings are equal");
//         }
//         else{
//             System.out.println("strings are not equal");
//         }
// }
// }

//substring : to print a post of a string
// public class strings {
//     public static void main(String args[]) {
//         String sentence="my name is vedika";
//         String name=sentence.substring(11, sentence.length());
//         System.out.println(name);
// }
// }

//strings are immutable mtlb cannot be modified that means the data inside them cannot be deleted nor be added
// and so to  modify a new string banani padti thi, so came the concept of string builder

// public class strings {
//     public static void main(String args[]) {
//         StringBuilder sb= new StringBuilder("tony");
//         System.out.println(sb);

//         //char at index 0
//         System.out.println(sb.charAt(0));

//         //set char at index 0
//         sb.setCharAt(0, 'p');
//         System.out.println(sb);

//         //to insect some character
//         sb.insert(0,'s');
//         System.out.println(sb);

//         //to delete some character
//         sb.delete(1, 3);  // 1 se leke 3-1=2 will gwt deleted
//         System.out.println(sb);

//         //append : adding more at the end of the string
//         sb.append('k');
//         System.out.println(sb);
// }
// }


// Q. reverse a string 
// public class strings {
//     public static void main(String args[]) {
//         StringBuilder sb= new StringBuilder("hello people");
//         for(int i=0;i<sb.length()/2;i++){
//             int front =i;
//             int back=sb.length()-1-i;
//             char frontchar =sb.charAt(front);
//             char backchar =sb.charAt(back);
//             sb.setCharAt(front, backchar);
//             sb.setCharAt(back, frontchar);
//         }
//         System.out.println(sb);
//     }
// }


//palindrome or not
// public class strings {
//     public static void main(String args[]) {
//         String str ="nitin";
//         int start= 0;
//         int end=str.length()-1;
//         boolean ispalindrome=true;
//         while(start<=end){
//             if(str.charAt(start)!=str.charAt(end)){
//                 ispalindrome=false;
//                 break;
//             }
//             start++;
//             end--;
//         }
//         System.out.println(ispalindrome);
//     }
// }


//
public class strings {
    public static void main(String args[]) {
        int fre[]=new int[26];
        String str="xxtfjyfkigjh";
        int start= 0;
        int end=str.length()-1;
        for(int i=start;i<=end;i++){
            char c =str.charAt(i);
            int index= c-'a';
            fre[index]+=1;
        }
        int max=0;
        for(int i=0;i<str.length();i++){
            if(fre[i]>fre[max]){
                max=i;
            }
        }
        char c=(char)(max+97);
        System.out.println(c);
    }
}