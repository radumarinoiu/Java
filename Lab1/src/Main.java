package com.company;


import java.util.Scanner;

public class Main {

    static int ChangeNr() {
        int n = (int) (Math.random() * 1_000_000);
        n = n * 3;
        String binary = "10101";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(n);
        n += decimal;
        int hexdec = 0xFF;
        n += hexdec;
        n = n * 6;
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        n = sum;
        sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello world");
        String[] languages = {"C", "C++", "C#", "Go", "JavaScript", "Perl", "PHP", "Python", "Swift", "Java"};
        int size = languages.length;

        for (int i = 0; i < size; i++)
            System.out.print(languages[i] + " ");
        int i = ChangeNr();
        System.out.println("Willy-nilly, this semester I will learn " + languages[i]);

    }




}
