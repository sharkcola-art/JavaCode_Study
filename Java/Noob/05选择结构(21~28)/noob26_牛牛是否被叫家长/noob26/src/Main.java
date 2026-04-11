import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        double Avg = (A + B + C)/3.0;

        if(Avg < 60){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        in.close();
    }
}
