// Утилита командной строки, которая выводит расширение файла.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "";

        Scanner scan = new Scanner(System.in);

        s = scan.next();

        String[] mas = s.split("\\.");

        System.out.println(mas[mas.length - 1]);
    }
}