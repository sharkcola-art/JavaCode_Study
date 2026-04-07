import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int S = 2*(a*b+b*c+c*a);
        int V = a*b*c;

        System.out.println(S + "\n" + V);

        in.close();
    }
}
