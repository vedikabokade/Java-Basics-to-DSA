public class pattern_printing_2 {
    public static void main(String[] args) {
        
        //advanced patterns
        //1.
        // *             *  11 12 13 14 15 16 17 18
        // * *         * *  21 22 23 24 25 26 27 28
        // * * *     * * *  31 32 33 34 35 36 37 38
        // * * * * * * * *  41 42 43 44 45 46 47 48
        // * * * * * * * *  51 52 53 54 55 56 57 58
        // * * *     * * *  61 62 63 64 65 66 67 68
        // * *         * *  71 72 73 74 75 76 77 78
        // *             *  81 82 83 84 85 86 87 88
        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" * ");
        //     }
        //     int space=2*(n-i);
        //     for(int j=1;j<=space;j++){
        //         System.out.print("   ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" * ");
        //     }
        //     int space=2*(n-i);
        //     for(int j=1;j<=space;j++){
        //         System.out.print("   ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        //2.
        //     ***** 
        //    *****
        //   *****
        //  *****
        // *****
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){   //for(int j=n;j>=1;j--)
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 3.
        //      ***** 
        //     *   *
        //    *   *
        //   *   *
        //  *****
         //         int n=5;
         //         for(int i=1;i<=n;i++){
        //             for(int j=1;j<=n-i;j++){
         //                 System.out.print(" ");
         //             }
         //             if (i==1 || i==n) 
         //             for (int j=1; j<=n; j++) {
         //                 System.out.print("*");
         //             }
         //             else
         //             for (int j=1; j<=n; j++){
         //                 if (j==1 || j==n){
         //                     System.out.print("*");
        //                 } 
         //                 else{
         //                     System.out.print(" ");
         //                 }
         //             }
         //         System.out.println();
         //         }
        
        //4. 
        //    1
        //   2 2
        //  3 3 3
        // 4 4 4 4
        //5 5 5 5 5
            // int n=5;
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=n-i;j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=1;j<=i;j++){
            //         System.out.print(+i+" ");
            //     }
            //     System.out.println();
            // }
        
        //5.
        //    1
        //   212
        //  32123
        // 4321234
        //543212345
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //6. 
        //diamond pattern
        //   *
        //  ***
        // *****
        //******* */
        //******* */
        // *****
        //  ***
        //   *
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }    
}