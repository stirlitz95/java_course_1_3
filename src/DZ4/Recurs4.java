package DZ4;

public class Recurs4 {
    public static void main(String[] args) {
        System.out.println(sum(1.1, 2.2, 3.3));

        test("Max", "123");
    }

    public static void test(String username, int pasword){
        System.out.println(username + "\n" + pasword);
        System.out.println("FIRST");
    }

    public static void test(String username, String pasword){
        System.out.println(username + "\n" + pasword);
        System.out.println("SECOND");
    }

    public static double sum(double... nums){
        double result = 0;

        for (double num : nums){
            result += num;
        }
        return result;
    }

    public static int sum(int... nums) {
        int result = 0;

        for (int num : nums) {
            result += num;
        }
        return result;
    }

}
