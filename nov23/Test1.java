package nov23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 8));

        l1.forEach((i) -> {
            System.out.println(i);
        });

        //   l1.removeIf((i)->i%2!=0);

        l1.removeIf((n)->{boolean b=false;
                          if(n%2==0) {
                          b=true;}
                          return b;
        });

        System.out.println("after removing values");

        l1.forEach((n)->{
            System.out.println(n);
        });


    }


}
