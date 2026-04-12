import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner( System.in );
        int n = in.nextInt();
        int sum = 0;

        for( int i = 1; i <= n; i++){
            int s1 = (int)Math.pow( (-1), (i - 1) ) * i;
            sum += s1;
        }


        System.out.println(sum);

        in.close();

    }
}

// //仅用循环
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(); // 输入正整数n
//        int sum = 0; // 用于存储前n项和
//
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 1) { // 奇数项，加i
//                sum += i;
//            } else { // 偶数项，减i
//                sum -= i;
//            }
//        }
//
//        System.out.println(sum); // 输出结果
//        scanner.close();
//    }
//}
