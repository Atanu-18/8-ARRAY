public class array_1 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        // int marks [] = new int[3];      // both lines are same
        
        marks[0] = 33; //phy
        marks[1] = 99; //chem
        marks[2] = 80; //math

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}
