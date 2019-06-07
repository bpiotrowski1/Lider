package pl.bpiotrowski;

import java.util.Scanner;

public class Main {
    private final static int ARRAY = 500000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] array = new int[ARRAY];

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            zeruj(array);

            for (int j = 0; j < n; j++) {
                array[in.nextInt()]++;
            }
            for (int j = 0; j < ARRAY; j++) {
                if (array[j] > (n / 2)) {
                    System.out.println(j);
                    break;
                } else if (j == ARRAY - 1) {
                    System.out.println("-1");
                    break;
                }
            }
        }
    }

    private static void zeruj(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }
}
