package DZ4;

import java.util.Scanner;

public class Recurs2 {
    public final static float PI = 3.14F;

    public static void main(String[] args) {

        test(1);
//        System.out.println(countNumbers2(new Scanner(System.in), 1, 2, 3, 4, 5));
        System.out.println("MAIN");

    }

    public static void test(int num){
        if (num == 1) {
            System.out.println(num);
        }else {
            return;
        }
        System.out.println("CONTINUE");
    }

//    public static String countNumbers2(Scanner scr, int name2, int... nums){
//        for (int num : nums) {
//            System.out.print(num);
//        }
//
//        int age = scr.nextInt();
//        System.out.println(age);
//
//        String name = "Max";
//        return name;
//    }
}
