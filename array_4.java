import java.util.Scanner;

public class array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //input erjonno
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        //output er jonno
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
