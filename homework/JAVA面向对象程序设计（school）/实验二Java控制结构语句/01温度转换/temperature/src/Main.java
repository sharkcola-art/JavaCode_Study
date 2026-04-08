import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        double c = 5.0 / 9 * (f - 32);

        System.out.println(c);

        in.close();
    }
}
