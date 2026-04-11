import java.util.Scanner;

public class Main {

    public static int sumColumn( int[][] m, int col ){
        int sum = 0;
        for( int i = 0; i < m.length; i++ ){
            sum = sum + m[i][col];
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //创建二维数组并规定它的大小
        System.out.println( "请输入 i X j 的二维矩阵" );
        System.out.print( "请输入矩阵的行数 i ：" );
        int rows = in.nextInt();
        System.out.print( "请输入矩阵的列数 j ：" );
        int cols = in.nextInt();
        System.out.printf( "你创建的数组为 %d X %d 的二维矩阵\n" , rows, cols );
        int[][] matrix = new int[rows][cols];

        //往 i 行 j 列的数组输入数据
        for( int i = 0; i < rows; i++ ){
            System.out.printf( "第 %d 行：", i + 1 );
            for ( int j = 0; j < cols; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        // 输出每列的和
        System.out.println( "每列元素的和为：" );
        for (int j = 0; j < cols; j++) {
            int columnSum = sumColumn(matrix, j);
            System.out.println( "第 " + (j + 1) + " 列的和 = " + columnSum );
        }

        in.close();

    }
}
