//2. 声明一个二维数组，为数组的每个元素赋值，并输出数组的值。

package experiment1;

import java.util.Scanner;

public class first2 {
    public static class Array {
        int row, column; // 行数和列数
        int[][] arr; // 二维数组

        public void inputNum() {
            System.out.print("请输入数组的行数：");
            Scanner sc = new Scanner(System.in);
            row = sc.nextInt();
            System.out.print("请输入数组的列数：");
            column = sc.nextInt();
            arr = new int[row][column];
        }

        public void inputArray() {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数组的值：");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
        }

        public void getArray() {
            System.out.println("数组的值为：");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.printf("%d ", arr[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Array arr = new Array();
        arr.inputNum();
        arr.inputArray();
        arr.getArray();
    }
}

//public class first2 {
//    public static void main(String[] args) {
//        int[][] arr = new int[3][3];
//        arr= new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
