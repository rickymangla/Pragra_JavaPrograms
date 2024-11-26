import java.util.Arrays;

public class Oct12 {

    public static void main(String[] args) {
    //    reverseArray(new int[]{40,20,5,60,70});
        System.out.println(reverseString("pragra"));
    }
    public static void maxElement(int[] array) {
        int max=array[0];

        for(int i=0;i<array.length;i++) {
            if(array[i]>max) {
                max=array[i];
            }
        }
        System.out.println("maximum number is: " + max);
    }

    public static void minElement(int[] array) {
        int min=array[0];

        for(int i=0;i<array.length;i++) {
            if(array[i]<min) {
                min=array[i];
            }
        }
        System.out.println("minimum number is: " + min);
    }

    public static void reverseArray(int[] array) {
        for(int i=0;i<array.length/2;i++) {
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static String reverseString(String word) {
        String rev="";
        for(int i=word.length()-1;i>=0;i--) {
            rev=rev+word.charAt(i);
        }
        return rev;
    }
}
