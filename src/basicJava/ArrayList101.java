package basicJava;

import java.util.ArrayList;

public class ArrayList101 {
    public static void main(String[] args) {


        ArrayList animals = new ArrayList();
        animals.add("Pig");
        animals.add("Cow");
        animals.add("Parrot");
        //animals.remove(0);
        animals.add(0, "Elephants");
        animals.add("Pork");


        System.out.println(animals);
        System.out.println(animals.get(0));
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("For animals # -> " + animals.get(i));
        }

        for (Object animal : animals) {
            int i = 0;

            System.out.println(animal + " " + animals.size());

        }

    }


}
