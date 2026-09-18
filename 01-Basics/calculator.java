import java.util.Scanner;
class calculator {
    public static void main(String srga[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        double n1=sc.nextDouble();
        System.out.println("enter number 2");
        double n2=sc.nextDouble();
        char operation ;
        System.out.println("enter operation from + - * / %");
        operation= sc.next().charAt(0);
        switch (operation) {
                case '+':
                System.out.println(n1+n2);
                break;
                case '-':
                System.out.println(n1-n2);
                break;
                case '*':
                System.out.println(n1*n2);
                break;
                case '/':
                System.out.println(n1/n2);
                break;
                case '%':
                System.out.println(n1%n2);
                break;
                default:
                System.out.println("invalid operation");
                break;
        }

    }
}
