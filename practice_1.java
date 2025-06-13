//take an array as input from the user. Serarch fora given no X & print the index at which it occurs.
// it is called linear search
import java.util.Scanner;

public class practice_1 {
    public static void main(String[] args) {
        System.out.println("the size is : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //for input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The value of x is : ");
        int x = sc.nextInt();

        //for output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x is found at index : " + i);
            }
        }

        sc.close();
    }
}
