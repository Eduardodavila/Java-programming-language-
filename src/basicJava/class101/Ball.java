package basicJava.class101;

/*
    Public - anyone can access
    Private - Only accessed whiting the class
 */
public class Ball {
    private String color;
    private String name;
    private int capacity;
    private int bounceRate;

    public Ball() {


    }

    public Ball(String mColor, String mName, int mCapacity, int mBounceRate) {
        color = mColor;
        name = mName;
        capacity = mCapacity;
        bounceRate = mBounceRate;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }
/*
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
*/
}
