package basicJava.class101;

public class Ball {

    public String color;
    public String name;
    public int capacity;
    public int bounceRate;

    //Behaviors

    public void bounce() {
        System.out.println("Bouncing");
    }

    public void defalte(){
        System.out.println("Deflating.....");
    }

    public void inflates(){
        System.out.println("Inflating....");
    }

}
