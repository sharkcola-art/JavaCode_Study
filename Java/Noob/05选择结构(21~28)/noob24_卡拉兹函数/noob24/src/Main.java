import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n % 2 != 0)
        {
            n = 3 * n + 1;
        }
        else
        {
            n = n / 2;
        }

        System.out.println(n);

        in.close();
    }
}
