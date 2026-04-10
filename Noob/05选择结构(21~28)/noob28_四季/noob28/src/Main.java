import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int season = in.nextInt() % 100;

        switch (season){
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            default: // 可选项：处理非法输入（如月份>12），题目保证输入正确，但养成好习惯
                System.out.println("Invalid month");
        }

        in.close();

    }
}
