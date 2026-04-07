import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // 计算n MB能存多少个int：n * 1024 * 1024字节 / 4字节每int = n * 2^18
        int totalIntegers = n * (1024 * 1024 / 4); // 或 n * 262144（因为1024 * 1024/4=262144）

        System.out.println(totalIntegers);

        in.close();
    }
}