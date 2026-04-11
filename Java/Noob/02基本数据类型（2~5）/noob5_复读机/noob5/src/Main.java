import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String Line1 = in.nextLine();
        System.out.println(Line1);

        String Line2 = in.nextLine();
        System.out.println(Line2);

        String Line3 = in.nextLine();
        double c = Double.parseDouble(Line3);
        System.out.printf("%.1f\n", c);

        String Line4 = in.nextLine();
        System.out.println(Line4.charAt(0));

        String Line5 = in.nextLine();
        System.out.println(Line5);

        in.close();
    }
}
