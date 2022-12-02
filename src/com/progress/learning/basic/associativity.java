package com.progress.learning.basic;

public class associativity {
    public static void main(String[] args) {
        int precedenceRule = 6*5-34/2;
        int associativityRule = 60/5-34*2;
        System.out.println("Bodmass rules : " + precedenceRule);
        System.out.println("Associativity rule : " + associativityRule);
        formulaEvaluation(args);
    }

    public static <a> void formulaEvaluation(String[] args) {
        int x = 10;
        int y = 1;
        int formula1 = x * y / 2;
        System.out.println(formula1);

//      bsquare - 4ac quadratic formula discriminant
//                parenthesis have higher discriminant
        int b = 1;
        int a = 7;
        int c = 4;
        int quadraticDiscriminant = (b*b) - (4*a*c) / (2*a);
        System.out.println(quadraticDiscriminant);
    }
}
