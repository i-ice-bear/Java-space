package questionSets;

public class starSet {
    public static void main(String[] args) {
        int rows, columns;
        rows = 4;
        columns = 6;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println('*');
            }
            System.out.println('*');
        }
    }
}
