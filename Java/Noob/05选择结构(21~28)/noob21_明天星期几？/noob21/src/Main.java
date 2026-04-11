import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();

        // 如果今天是7（周日），明天是1；否则明天是d+1
        int day = (d == 7) ? 1 : d + 1;

        System.out.println(day);

        in.close();
    }
}