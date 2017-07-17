package hello;

public class MMethods {

    public static void main(String[] args) {
        myName1();
        anotherMethod1();
        myName2("Eduardo D'Avila");
        anotherMethod2("From USA");
        addNumber(10, 6);
    }

    //Method#1
    public static void myName1() {
        System.out.println("Eduardo");
    }

    //Another Method#1
    public static void anotherMethod1() {
        System.out.println("Another Method");
    }

    //Method#2
    public static void myName2(String mName2) {
        System.out.println(mName2);
    }

    //Another Method#2
    public static void anotherMethod2(String anotheMethod2) {
        System.out.println(anotheMethod2);
    }

    public static void addNumber(float a, float b) {
        System.out.println(a + b);
    }

}
