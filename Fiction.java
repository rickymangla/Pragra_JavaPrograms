public class Fiction extends Book1 {

    String fiction;
    String nonFiction;

    Fiction(String fiction, String nonFiction) {
    //    super("comedy","five points someone");
        this.fiction=fiction;
        this.nonFiction=nonFiction;
    }

    void display(String book) {
        System.out.println("this is method of child class");
    }

    public static void main(String[] args) {
        Book1 b=new Fiction("jsjsj","jsjssj");
        b.show();
       // b.display("jfkfkf");
//        Fiction f=new Fiction("jdkdkd","fkfkfkkf");
//        f.display();
//        f.display("ldldld");

    }
}
