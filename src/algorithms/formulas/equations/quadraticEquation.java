package algorithms.formulas.equations;

public class quadraticEquation {
    public static void main(String[] args) {
//      x - y / 2
        int x = 4, y = 2;
        int output = (x - y) /(2);
        System.out.println(output);
        quadraticEquationDiscriminant(args);
    }

    public static void quadraticEquationDiscriminant(String[] args) {
        int a = 3;
        int b = 4;
        int c = 1;
        int formulaIterated = (b * b) - (4 * a * c) / (2*a);
        System.out.println(formulaIterated);
        velocityCalculation(args);
    }

    public static void velocityCalculation(String[] args) {
        int v =9;
        int u = 10;
        int output_velocity = (v * v) - (u*u);
        System.out.println("Output velocity : " + output_velocity);
        quadration(args);
    }

    public static void quadration(String[] args) {
        int a = 10;
        int b = 20;
        int d = 30;
        int output_quadration = (a * b) - d ;
        System.out.println("Output quadration : " + output_quadration);
    }
}
