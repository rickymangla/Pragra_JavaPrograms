public class GoogleSheet {

    private int rows;
    private int cols;

    public GoogleSheet(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public int getRows() {
        return this.rows;
    }

    public int getCols() {
        return this.cols;
    }
}

 class Test123 {
    public static void main(String[] args) {
       GoogleSheet gs=new GoogleSheet(23,23);
        System.out.println(gs.getRows());
        System.out.println(gs.getCols());

    }
}
