package nov23;
@FunctionalInterface
public interface FoodProcessor<T,U> {

    U process(T t);
}
