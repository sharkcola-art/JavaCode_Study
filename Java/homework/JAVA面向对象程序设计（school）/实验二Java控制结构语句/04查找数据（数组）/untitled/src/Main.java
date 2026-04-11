import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("你要存入几个数：");
        int n = in.nextInt();
        int[] arraySearch = new int[n];
        //往数组里存入数据
        for( int i = 0; i < n ; i++ ){
            System.out.print("请输入第" + (i+1) + "个数：");
            arraySearch[i] = in.nextInt();
        }

        //查找数据
        System.out.print("你要查找什么数：");
        int searchInt = in.nextInt();
        boolean found = false; // 先假设没找到
        for( int i = 0; i < arraySearch.length; i++ ){
            if( arraySearch[i] == searchInt ){
                System.out.printf("该数是数组中的第%d个数", i+1);
                found = true;
                break;
            }
        }
        if (!found) { // 循环结束后还没找到
            System.out.println("未找到该数");
        }

        in.close();

    }
}
