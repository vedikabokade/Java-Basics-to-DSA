import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        
        //1. printing same using for loop
        // for (int i=0;i<11;i++){
        //     System.out.println(i);
        // }

        //2. using while loop
        // int i=0;
        // while (i<11) {
        //     System.out.println(i);
        //     i=i+1;
        // }

        //3. using do while loop
        // int i=0;
        // do{
        //     System.out.println(i);
        //     i=i+1;
        // }while(i<11);


        //Q. print sum of n natural numbers
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the value of n");
        // int n = sc.nextInt();
        // int sum=0;
        // for(int i=0;i<=n;i++){
        //     sum=sum+i;
        // }
        // System.out.println("sum of first "+n+" natural numbers is ="+sum);
    
        //Q. print table of number input by the user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n whose table is to be printed ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }    
    }
}
