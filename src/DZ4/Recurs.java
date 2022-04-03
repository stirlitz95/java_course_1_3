package DZ4;

import java.util.Scanner;

public class Recurs {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("please, input your age!");
        int age000 = scr.nextInt();
        test(age000);
//        printMenu();
        int[] array = {1,2,3,4};
        printArray(array);
    }

    public static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");

        }
    }

    public static void test(int age) {

        if (age >= 18)
            System.out.println("adult");
        else
            System.out.println("kid");

    }

    public static void printMenu(){
        System.out.println("menu:\n" +
                "           1.add\n" +
                "           2.muliply");
    }
}
