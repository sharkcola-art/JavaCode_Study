import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        // 欧几里得距离 dE = √[(x1-x2)² + (y1-y2)²]
        double dx = x1 - x2;
        double dy = y1 - y2;
        double dE = Math.sqrt(dx * dx + dy * dy);

        // 曼哈顿距离 dM = |x1-x2| + |y1-y2|
        double dM = Math.abs(dx) + Math.abs(dy);

        // 绕距 Δ = |dM - dE|
        double result = Math.abs(dM - dE);

        System.out.println(result);

        in.close();
    }
}