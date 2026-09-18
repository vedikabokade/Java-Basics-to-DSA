//import java.util.Scanner;
public class pattern_printing {
    public static void main(String[] args) {
        
        //1.
        //$$$$.........m=col
        //$$$$
        //$$$$
        //.
        //.
        //n=rows
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter no of columns");
        // int m=sc.nextInt();
        // System.out.println("enter no of rows");
        // int n=sc.nextInt();
        // for(int i =0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print("$");
        //     }
        //     System.out.print("\n");
        // }


        //2.
        //$$$$$....j=col=m i=1 11 12 13 14 15 
        //$   $            i=2 21 22 23 24 25
        //$   $            i=3 31 32 33 34 35
        //$$$$$            i=4 41 42 43 44 45
        //.
        //.
        //i=row=n
        // int n=4;
        // int m=5;
        // for(int i =1;i<=n;i++){
        //         for(int j=1;j<=m;j++){
        //             if(i==1 || i==4 || j==1 || j==5){
        //                 System.out.print("$");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //         System.out.print("\n");
        //     }

            //3.
            //$                   i=1 11 12 13 14 15 
            //$$                  i=2 21 22 23 24 25
            //$$$                 i=3 31 32 33 34 35
            //$$$$     ....j=m    i=4 41 42 43 44 45     
            //$$$$$
            //.
            //i=n
            // int n=5;
            // int m=5;
            // for(int i =1;i<=n;i++){
            //     for(int j=1;j<=m;j++){
            //         if(i>=j){
            //             System.out.print("$");
            //         }
            //         else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.print("\n");
            // }

            //4.
            //$$$$$             i=1 11 12 13 14 15 
            //$$$$              i=2 21 22 23 24 25
            //$$$               i=3 31 32 33 34 35
            //$$     ....j=m    i=4 41 42 43 44 45     
            //$
            //.
            //i=n
            // int n=5;
            // int m=5;
            // for(int i =1;i<=n;i++){
            //     for(int j=1;j<=m;j++){
            //             System.out.print("$");
            //     }
            //     System.out.print("\n");
            //     m=m-1;
            // }

            //5.
            //    $                i=1 11 12 13 14 15 
            //   $$                i=2 21 22 23 24 25
            //  $$$                i=3 31 32 33 34 35
            // $$$$     ....j=m    i=4 41 42 43 44 45     
            //$$$$$                i=5 51 52 53 54 55
            //.
            //i=n
            // int n=5;
            // for(int i =1;i<=n;i++){
            //     for(int j=1;j<=n-i;j++){
            //             System.out.print(" ");
            //     }
            //     for(int j=1;j<=i;j++){
            //         System.out.print("$");
            //     }
            //     System.out.println();
            // }

            //6.
            //1
            //12
            //123
            //1234
            //12345
            // int n=5;
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }
 
            //7.
            //12345
            //1234
            //123
            //12
            //1
            // int n=5;
            // int m=5;
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=m;j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            //     m--;
            // }

            //8.
            // 1
            // 2  3
            // 4  5  6
            // 7  8  9  10
            // 11 12 13 14 15
            // int n=5;
            // int number=1;
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print("  "+number+"  ");
            //         number++;
            //     }
            //     System.out.println();
            // }

            //9.
            //1  2  3  4  5  
            //6  7  8  9
            //10 11 12 
            //13 14 
            //15
            // int n=5;
            // int number=1;
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=n-i+1;j++){
            //         System.out.print("  "+number+"  ");
            //         number++;
            //     }
            //     System.out.println();
            // }

            //10.
            //1               11 12 13 14 15
            //0 1             21 22 23 24 25
            //1 0 1           31 32 33 34 35
            //0 1 0 1         41 42 43 44 45
            //1 0 1 0 1       51 52 53 54 55
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print(" 1 ");
                    }
                    else{
                        System.out.print(" 0 ");
                    }
                }
                System.out.println();
            }
    }
}
