
import java.util.*;

public class EqualStackSum {
    public static int maxEqualSum(List<Integer> stack1, List<Integer> stack2, List<Integer> stack3) {
        int sum1 = stack1.stream().mapToInt(Integer::intValue).sum();
        int sum2 = stack2.stream().mapToInt(Integer::intValue).sum();
        int sum3 = stack3.stream().mapToInt(Integer::intValue).sum();

        while (!stack1.isEmpty() && !stack2.isEmpty() && !stack3.isEmpty()) {
            if (sum1 == sum2 && sum2 == sum3) {
                return sum1;
            }
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= stack1.remove(0);
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= stack2.remove(0);
            } else {
                sum3 -= stack3.remove(0);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in first stack: ");
        int n1 = scanner.nextInt();
        List<Integer> stack1 = new ArrayList<>();
        System.out.println("Enter elements of first stack:");
        for (int i = 0; i < n1; i++) {
            stack1.add(scanner.nextInt());
        }

        System.out.print("Enter number of elements in second stack: ");
        int n2 = scanner.nextInt();
        List<Integer> stack2 = new ArrayList<>();
        System.out.println("Enter elements of second stack:");
        for (int i = 0; i < n2; i++) {
            stack2.add(scanner.nextInt());
        }

        System.out.print("Enter number of elements in third stack: ");
        int n3 = scanner.nextInt();
        List<Integer> stack3 = new ArrayList<>();
        System.out.println("Enter elements of third stack:");
        for (int i = 0; i < n3; i++) {
            stack3.add(scanner.nextInt());
        }

        scanner.close();

        System.out.println("Maximum equal sum possible: " + maxEqualSum(stack1, stack2, stack3));
    }
}
