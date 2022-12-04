package com.progress.learning.Class;

import java.util.Scanner;

public class inheritanceClassLevel{
    public static void main(String[] args) {
        ageChecker checkAges = new ageChecker();
        checkAges.canDrive();
        System.out.println("Main class caller");
    }
}

class ageChecker{
    void canDrive(){
        Scanner enterAge = new Scanner(System.in);
        int getAge = enterAge.nextInt();

        if (getAge >= 18){
            System.out.println("You can drive");
        }else{
            System.out.println("You cannot drive");
        }
    }
}