package DZ4;

public class Recurs3 {
    public static void main(String[] args) {
//        System.out.println(login("Max"));

        int[] array = login("max");
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static int[] login(String username){
        return new int[3];
    }


//    public static String login(String username){
//        return username.equals("max") ? "MAX" : username.equals("ADMIN") ? "admin" : username;
//    }
}
