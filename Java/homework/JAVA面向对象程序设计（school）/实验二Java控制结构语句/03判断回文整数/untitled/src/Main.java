import java.util.Scanner;

public class Main {

    public static String reverse(String str){
        String result = "";

        for(int i = str.length() - 1; i >= 0; i--){
            result = result + str.charAt(i);
        }

        return result;
    }

    public static boolean isPalindrome(String str){
        String reversed = reverse(str);

        return str.equals(reversed);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("请输入：");
        String input = in.nextLine();
        System.out.println("反转后：" + reverse(input));
        System.out.println("是否是回文数：" + isPalindrome(input));

    }
}
