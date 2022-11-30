package algorithms.formulas;

public class distanceFormula {
    public static void main(String[] args) {
        float x_coordinate_1 = 4;
        float x_coordinate_2 = 6;
        float y_coordinate_1 = 6;
        float y_coordinate_2 = 4;
        float distanceFormula = (float) Math.sqrt(Math.pow((x_coordinate_2 - x_coordinate_1), 2)  +
                Math.pow((y_coordinate_2 - y_coordinate_1), 2) );
        System.out.println("The distance is : " + distanceFormula);
    }
}
