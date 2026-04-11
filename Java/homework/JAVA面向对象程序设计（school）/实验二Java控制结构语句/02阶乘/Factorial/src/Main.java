import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Factorial out = new Factorial();
        int result = out.getResult(in.nextInt());

        //1!+2!+...+n!的结果
        System.out.println(result);
    }
}
