package DZ3;


public class Аrray {
    public static void main(String[] args) {
        Integer[] ages = {3, 22, 1, 13, 4, 6, 16, 5};

        //1
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] % 2 == 0)
                System.out.print(ages[i] + "\t");
        }
        System.out.println();

        //2

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > 9)
                System.out.print(ages[i] + "\t");
        }
        System.out.println();

        //3
        int maxNum = ages[0];
        for (int i : ages) {
            if (i > maxNum)
                maxNum = i;
        }
        System.out.println(maxNum);

        //4
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum = sum + ages[i];
        }
        System.out.println(sum);

        //5
        for (int i = ages.length - 1; i >= 0; i--)
            System.out.print(ages[i] + "\t");

    }
}
