package basicJava;

public class Arrays {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4};
        String[] myStringArray = {"Hello", "Hi", "What"};
        int[] newArray = new int[6];
        String[] newStringArray = new String[5];

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

        newArray[0] = 3;
        newArray[1] = 4;
        newArray[2] = 6;
        newArray[3] = 1;
        newArray[4] = 12;
        newArray[5] = 54;


        for (int k = 0; k < newArray.length; k++) {
            System.out.println("newArray -> " + newArray[k]);
        }


    }
}
