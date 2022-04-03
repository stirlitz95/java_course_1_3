package DZ4;

public class Recurs5 {
    public static void main(String[] args) {
        System.out.println(factorial(-1));
        System.out.println(factorial(1));
        System.out.println(factorial(5));
    }

    public static int factorial(int num) {
//        if (num < 1)
//            return 0;
//        if (num == 1)
//            return 1;
//        return num * factorial(num - 1);
        return num < 1 ? 0 : num == 1 ? 1 : num * factorial(num-1);
    }

//    public static int factorial(int num) {
//        int result = 1;
//        while (num != 1) {
//            result *= num;
//            num--;
//        }
//        return result;
//    }

}
