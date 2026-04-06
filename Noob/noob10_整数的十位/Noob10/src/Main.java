import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = a % 100 / 10;

        System.out.println(c);

        in.close();
    }
}
