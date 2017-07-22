package hello;
/* Logical Operators
* AND(&&)
* OR(||)
* NOT(!)

 */

/* Relational Operators
* == comparison, not assignment
* != NOT equal
* > greater than
* < less then
* >= Greater then or equal
* <= less then or equal
 */
public class LogicalOperAndIfStatements {
    public static void main(String[] args) {
        boolean isOld = true;
        boolean isYoung = false;
        double firstNum = 10;
        double secondNum = 3;
        if (isOld && isYoung) {
            System.out.println("&&");
        }
        if (isOld || isYoung) {
            System.out.println("||");
        }
        if (isOld && !isYoung) {
            System.out.println("&& !");
        }
        if (isOld && !isYoung && (firstNum < secondNum)) {
            System.out.println("&& ! && >");
        } else{
            System.out.println("Test");
        }


    }
}
