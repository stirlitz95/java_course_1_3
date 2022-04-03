package DZ3;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[][] array = new int[4][3];
        System.out.println("введите елементы");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = s.nextInt();
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        /////////////////////////   1 2 3 4 5 6 7 8 9 10 11 12
        //1
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println("Line " + i + ": " + sum);
        }
        System.out.println("--------------");
        /////////////////////////   1 2 3 4 5 6 7 8 9 10 11 12
        //2
        for (int i = 0; i < array.length - 1; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length + 1; j++) {
                sum += array[j][i];
            }
            System.out.println("Column " + i + ": " + sum);
        }
        System.out.println("---------");
        /////////////////////////   1 2 3 4 5 6 7 8 9 10 11 12
        //3
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");

        /////////////////////////   1 2 3 4 5 6 7 8 9 10 11 12
        //4
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println("Line " + i + ": " + sum/array[i].length);


        }
    }
}
