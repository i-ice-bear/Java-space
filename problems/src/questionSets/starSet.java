package questionSets;

public class starSet {
    public static void main(String[] args) {
        int rows, columns;
        rows = 4;
        columns = 6;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print('*');
            }
            System.out.println('*');
        }
    }
}
