package nov9;

public class Print <T>{

    T d;

    Print(T d) {
        this.d=d;
    }

    @Override
    public String toString() {
        return "Print{" +
                "d=" + d +
                '}';
    }

    void getDetails() {
        System.out.println(d);
    }

}
