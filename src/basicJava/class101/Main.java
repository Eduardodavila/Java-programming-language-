package basicJava.class101;

public class Main {
    public static void main(String[] args) {
        Ball myBall = new Ball();
        Ball secondBall = new Ball();

        myBall.color = "Blue";
        myBall.name = "Basketball";
        System.out.println(myBall.name);
        System.out.println(myBall.color);



        secondBall.name = "Soccer Ball";
        secondBall.color = "Brown";

        System.out.println(secondBall.name);
        System.out.println(secondBall.color);

    }
}





