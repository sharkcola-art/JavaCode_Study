import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(); // n 最大是 1e9，用 long 防止溢出

        long sum = n * (n + 1) / 2; // 等差数列求和公式

        System.out.println(sum);

        in.close();
    }
}