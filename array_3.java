//using user input

import java.util.Scanner;

public class array_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
//ekhane kono value deoa nei tai initialize with null value