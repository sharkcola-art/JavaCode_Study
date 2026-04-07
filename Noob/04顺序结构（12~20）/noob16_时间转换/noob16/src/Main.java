import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();  // 输入的秒数

        int hour = seconds / 3600;          // 小时数
        int remaining = seconds % 3600;     // 去掉小时后的剩余秒数
        int minute = remaining / 60;        // 分钟数
        int second = remaining % 60;        // 剩余秒数

        System.out.printf("%d %d %d", hour, minute, second);
        in.close();
    }
}