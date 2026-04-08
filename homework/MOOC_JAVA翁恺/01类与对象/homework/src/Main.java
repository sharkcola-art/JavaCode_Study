import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());

        a.printFraction();
        b.printFraction();
        a.plus(b).printFraction();
        a.multiply(b).plus(new Fraction(5,6)).printFraction();
        a.printFraction();
        b.printFraction();

        in.close();

    }

}