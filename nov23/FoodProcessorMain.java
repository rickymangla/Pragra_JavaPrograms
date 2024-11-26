package nov23;

import org.w3c.dom.ls.LSOutput;

public class FoodProcessorMain {
    public static void main(String[] args) {
        FoodProcessor<String, Integer> fp =(t)->{
            return 23;};

        System.out.println(fp.process("Potato"));
    }

}
