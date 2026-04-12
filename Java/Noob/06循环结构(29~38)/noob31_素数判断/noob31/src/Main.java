import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // 读取需要判断的数的个数

        for (int i = 0; i < T; i++) {
            int n = in.nextInt(); // 读取当前要判断的数

            boolean isPrime = true; // 假设n是素数

            // 特殊情况：n=1 不是素数
            if (n == 1) {
                isPrime = false;
            } else if (n == 2) {
                isPrime = true; // 2是素数
            } else {
                // 从2到√n检查是否有因子
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) { // 找到因子，不是素数
                        isPrime = false;
                        break; // 提前结束循环，不需要再检查
                    }
                }
            }

            // 根据isPrime输出结果
            if (isPrime) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        in.close();
    }
}