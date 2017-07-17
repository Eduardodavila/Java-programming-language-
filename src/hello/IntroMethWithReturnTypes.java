package hello;

public class IntroMethWithReturnTypes {
    public static void main(String[] args) {
        returnIntegerVoid(10, 20);

        int finalResult = returnIntegerInteger(20, 20) * 2;
        System.out.println(finalResult);

        String finalFullName = fullName("Eduardo", "D'Avila");
        System.out.println(finalFullName);

        System.out.println(showChar('E'));

    }


    public static void returnIntegerVoid(int a, int b) {
        System.out.println("returnIntegerVoid = " + (a + b));
    }

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


