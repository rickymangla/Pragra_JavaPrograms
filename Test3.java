public class Test3 {
    static int x=10;
    int y=20;
    public void change(int y) {
       x=30;
     //   this.y=y;

        //       y=30;
    }

    public void display() {
        x++;
        y++;
        System.out.println(this.x);
        System.out.println(this.y);
    }

//    public static void show() {
//        System.out.println(y);
//    }

    public static void twoDArray() {
        int a[][]=new int[][]{{1,2,3},
                              {4,5,6},
                              {7,8,9}};
        int b[][]=new int[][]{{10,11,12},
                              {13,14,15},
                              {16,17,18}};
        int c[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[0].length;j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int k=0;k<c.length;k++) {
            for(int l=0;l<c[0].length;l++) {
                System.out.print(c[k][l] + " ");
            }
            System.out.println();
        }
    }

    static void compare() {
        String s1="welcome";
        String s2="welcome";

        String s3=new String("welcome");
        String s4=new String("welcome");

        System.out.println(s1==s2);        //true
        System.out.println(s1.equals(s2));  //true
        System.out.println(s1==s3);         //false
        System.out.println(s1.equals(s3));  //true
        System.out.println(s3==s4);         //false
        System.out.println(s3.equals(s4));   //true
    }

    public static void main(String[] args) {
        // twoDArray();
        compare();
//        Test3 t3=new Test3();
//        t3.change(x);
//        System.out.println(x);
//        t3.display();
//        Test3 t4=new Test3();
//        t4.display();
    }
}
