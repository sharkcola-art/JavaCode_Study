import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        // 转换为整数运算：(A*2 + B*3 + C*5) / 10
        int S = (A * 2 + B * 3 + C * 5) / 10;

        System.out.println(S);

        in.close();
    }
}