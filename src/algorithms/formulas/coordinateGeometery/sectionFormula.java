/**
 * Overall Formula :
 *      x = m1x2 - m2x1 / m1 + m2
 *      y = m1y2 - m2y1 / m1 + m2
 *
 * @description : internal Calculation
 * */


package algorithms.formulas.coordinateGeometery;

public class sectionFormula {
    public static void main(String[] args) {
        float __measurement_section_1 = 2;
        float __measurement_section_2 = 2;
        float _x_coordinate_1 = 4;
        float _x_coordinate_2 = 8;
        float _y_coordinate_1 = 4;
        float _y_coordinate_2 = 8;

        float _x_section_coordination =
                (__measurement_section_1) * (_x_coordinate_2) - (__measurement_section_2) * (_x_coordinate_1)
                 / (__measurement_section_1) + (__measurement_section_2);

        System.out.println("X section co-ordinate : " + _x_section_coordination);

        float _y_section_coordination =
                (__measurement_section_1) * (_y_coordinate_2) - (__measurement_section_2) * (_y_coordinate_1)
                / (__measurement_section_1) + (__measurement_section_2);

        System.out.println("Y section co-ordinates : " + _y_section_coordination);
        System.out.println("Overall co-ordinates : " + _x_section_coordination + " " + _y_section_coordination);
    }
}
