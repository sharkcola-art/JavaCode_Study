import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double K = in.nextDouble();
        double C = K - 273.15;
        double F = C * 1.8 + 32;

        System.out.println(F);

        in.close();
    }
}
