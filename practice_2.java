//Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String names[] = new String[size];

        //for i/p
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();  //string bole only sc.next() eseche
        }

        //for o/p
        for (int i = 0; i < names.length; i++) {
            System.out.println("name " + (i) + " is " + names[i]);
        }
//(i) or (i+1) deoa jay
        sc.close();
    }
}
