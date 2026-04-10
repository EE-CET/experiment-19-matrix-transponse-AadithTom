import java.util.Scanner;

public class SumExceptSelf {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (!scanner.hasNextInt()) return;
            int n = scanner.nextInt();
            int[] nums = new int[n];
            long totalSum = 0;
            for (int i = 0; i < n; i++) {
                if (scanner.hasNextInt()) {
                    nums[i] = scanner.nextInt();
                    totalSum += nums[i];
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print((totalSum - nums[i]) + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}
