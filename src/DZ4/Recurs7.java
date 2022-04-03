package DZ4;

import java.util.Scanner;

public class Recurs7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Введите имя и число от двухзначного по трехзначное: ");
        String enterText = s.nextLine();
        printText(enterText);
    }

    public static void printText(String text) {
        String[] arrayNameAndNum = text.split(" ");
        if (check(text).equals("проверка пройдена")) {
            System.out.println("здравствуй, " + arrayNameAndNum[0] + " сумма чисел в числе = " + sum(arrayNameAndNum[1]));
        } else {
            System.out.println("неверный ввод, перезапустите программу и введите данные повторно");
        }
    }

    public static String check(String numb) {
        String[] arrayStr = numb.split(" ");
        if ( (1 < arrayStr[1].length())  &&  !(arrayStr[1].length() > 3)) {
            return "проверка пройдена";
        } else {
            return "неправильное число, надо повторить ввод";
        }
    }

    public static String sum(String numbs) {
        char[] elements = numbs.toCharArray();
        int result = 0;
        for (char element : elements) {
            result += Integer.parseInt(String.valueOf(element));
        }

        return switch (result) {
            case 10 -> "десять";
            case 9 -> "девять";
            case 8 -> "восемь";
            case 7 -> "семь";
            case 6 -> "шесть";
            case 5 -> "пять";
            case 4 -> "четыре";
            case 3 -> "три";
            case 2 -> "два";
            case 1 -> "один";
            default -> "ошибка (попробуйте ввести меньшее число)";
        };
    }
}
