import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while(n > 0)
        {
            int end = n % 10;
            System.out.print(end);
            n /= 10;
        }

        in.close();
    }
}
