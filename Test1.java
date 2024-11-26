public class Test1 {

    // Ask whether static variables are going to store results
    static int x = 10;  //by using static in front of it, why output is 11,12
    //by using non-static, output is always 11

    String name;
    int id;
    double salary;

    Test1() {
//      x++;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                "}";

    }
    public void show() {
        System.out.println("this is: " + '\n' + "new line");
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        System.out.println(t1);
        t1.show();
//        System.out.println(t1.x);
//        Test1 t2=new Test1();
//        System.out.println(t2.x);
    }
}
