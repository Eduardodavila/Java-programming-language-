package basicJava;

/* for loop
   while loop
  */

public class ForAndWhileLoops101 {

    public static void main(String[] args) {
        // for loops
            for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Counting " + i);
            }
        }

        System.out.println("\t");

        // while loops
        int j = 0;
        while (j < 5) {
            System.out.println("Count while" + j);
            j++;

        }
    }
}
