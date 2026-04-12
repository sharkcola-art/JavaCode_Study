import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //第一行输入一个整数T（1≤T≤100），表示数据组数
        int T = in.nextInt();

        //接下来T行，每行输入两个整数a，b（0≤a，b≤100），用空格隔开。
        for( int i = 0; i < T; i++ ){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }

        in.close();
    }
}