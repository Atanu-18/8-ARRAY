//Find the maximum & minimum number in an array of integers

import java.util.Scanner;

public class practice_3 {
    public static void main(String[] args) {

        System.out.println("The size is : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        //result
        System.out.println("Largest element is : " + max);
        System.out.println("Smallest element is : " + min);

        sc.close();
    }
}
