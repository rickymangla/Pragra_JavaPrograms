public class GoogleSheet1 {

    private int rows;
    private int cols;

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
}

class Test1234 {
    public static void main(String[] args) {
        GoogleSheet1 gs = new GoogleSheet1();
        gs.setRows(23);
        gs.setCols(23);
    }
}
