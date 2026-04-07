import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int d = in.nextInt();
        double a = (double)d/c*100;

        System.out.printf("%.3f%%", a);

        in.close();
    }
}
