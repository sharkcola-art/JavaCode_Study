import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a;

        a = in.nextDouble();

        System.out.printf("%.3f",a);

        in.close();
    }
}
