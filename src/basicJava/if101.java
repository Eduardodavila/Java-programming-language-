package basicJava;

public class if101 {
    public static void main(String[] args) {
        double firstNum = 10;
        double secondNum = 3;
        double result;
        result = firstNum % secondNum;

        System.out.println("The remainder is #1 " + (result));

        //If statements

        if (firstNum == secondNum){
            System.out.println("The remainder is #2 " + (result));
        } else {
            System.out.println("Hello");

        }

    }
}
/* Relational Operators
* == comparison, not assignment
* != NOT equal
* > greater than
* < less then
* >= Greater then or equal
* <= less then or equal
 */