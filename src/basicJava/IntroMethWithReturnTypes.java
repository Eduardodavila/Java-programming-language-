package basicJava;

public class IntroMethWithReturnTypes {
    public static void main(String[] args) {
        returnIntegerVoid(10, 20);

        int finalResult = returnIntegerInteger(20, 20) * 2;
        System.out.println(finalResult);

        String finalFullName = fullName("Eduardo", "D'Avila");
        System.out.println(finalFullName);

        System.out.println(showChar('E'));

        //Return value method returnIntegerInteger
        System.out.println(returnIntegerInteger(10, 1));

    }


    public static void returnIntegerVoid(int a, int b) {
        System.out.println("returnIntegerVoid = " + (a + b));
    }
// Return an integer
    public static int returnIntegerInteger(int a, int b){
        return (a + b);
    }

    public static String fullName(String firstName, String lastName) {
        return (firstName + " x x " + lastName);
    }

    public static Character showChar(Character a) {
        return a;

    }
}


