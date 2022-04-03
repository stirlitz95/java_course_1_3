package DZ4;

public class Recurs6 {
    public static void main(String[] args) {
        String nane = new String(new char[]{'J','a','v','a'});
        String nane1 = new String(new char[]{'J','a','v','a'}, 1,2);
        String nane3 = "Max";
 //       System.out.println(nane + "\n" + nane1);

//        String username = null;
//
//        if (username != null && username.isEmpty()){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }

        System.out.println(nane3.length());

        String trimEx = "    fghgfh     ";
        System.out.println(trimEx.trim());

        String words = "Hi! Java aaa bbb ccc";
        String[] strArray = words.split(" ");
        System.out.println(strArray[4]);

//        System.out.println(strArray[3].toCharArray());

    }
}
