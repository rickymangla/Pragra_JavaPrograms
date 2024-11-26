package nov23;

@FunctionalInterface
public interface Eat {

//    String eat();
    default void drink() {
        System.out.println("drinking water");
    }
    String play(String teamA, String teamB);
}
