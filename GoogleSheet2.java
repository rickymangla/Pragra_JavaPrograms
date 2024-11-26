public class GoogleSheet2 {

    private int rows;
    private int cols;

//    public GoogleSheet1(int rows, int cols) {
//        this.rows = rows;
//        this.cols = cols;
//    }

    public int getRows() {
        return this.rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return this.cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
}

class Test12345 {
    public static void main(String[] args) {
        GoogleSheet2 gs = new GoogleSheet2();
        gs.setRows(23);
        System.out.println(gs.getRows());
        gs.setCols(23);
        System.out.println(gs.getCols());
    }
}
