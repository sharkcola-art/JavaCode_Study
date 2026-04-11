import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int season = in.nextInt() % 100;

        String seasonName = "Invalid month"; // 默认非法输入

        switch (season) {
            case 3:
            case 4:
            case 5:
                seasonName = "spring";
                break;
            case 6:
            case 7:
            case 8:
                seasonName = "summer";
                break;
            case 9:
            case 10:
            case 11:
                seasonName = "autumn";
                break;
            case 12:
            case 1:
            case 2:
                seasonName = "winter";
                break;
            // default 可省略，因为默认已设为 "Invalid month"
        }

        System.out.println(seasonName); // 单一出口：只在这里输出一次

        in.close();
    }
}