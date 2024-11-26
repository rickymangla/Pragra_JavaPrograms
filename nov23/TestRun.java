package nov23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRun {
    public static void main(String[] args) {
//        Eat eat = () -> { return
//                "Eating Lambda Icecream";};
//        System.out.println("eat.eat()=" + eat.eat());
//
//        eat.drink();

        Eat eat = (a, b) -> {
            return
                    Math.random() > 0.5 ? a : b;
        };
        System.out.println("outcome is: " + eat.play("sept 2024", "nov 2024"));

        List<String> names = Arrays.asList("Gagan", "Jagmeet", "Anmol", "Prateek", "Alok");
        List<String> names1 = new ArrayList<>(names);

        System.out.println(names);
        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(names);
        names1.removeIf((s1) -> s1.length() > 4);
        System.out.println(names1);






    }
}
