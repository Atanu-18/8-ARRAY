//Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order

import java.util.Scanner;

public class practice_4 {
    public static void main(String[] args) {
        System.out.println("the size is : ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isascending = true;

        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > numbers[i+1]) {
                isascending = false;
            }
        }

        if (isascending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

        sc.close();
    }
}
