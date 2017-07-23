package basicJava;

public class Arrays {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4};
        String[] myStringArray = {"Hello", "Hi", "What"};
        int[] newArray = new int[5];

        System.out.println(myArray[0]);
        System.out.println(myStringArray[0]);
        System.out.println(myArray.length);
        System.out.println(myStringArray.length);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Item myArray #= " + myArray[i]);
        }
        for (int j = 0; j < myStringArray.length; j++) {
            System.out.println("Item myStringArray #= " + myStringArray[j]);
        }
    }
}
