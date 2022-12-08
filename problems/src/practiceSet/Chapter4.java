package practiceSet;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Chapter4 {
    public static void main(String[] args) {
        //Question 1:  Comparison problem
        Scanner enterNumber = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = enterNumber.nextInt();
        if (a == 10){
            System.out.println("I'm equal ");
        } else{
            System.out.println("I'm not Equal");
        }
        problem2();
    }

    static void problem2() {
        // Question 2: Pass and fail,
        Scanner getSubjectMarks = new Scanner(System.in);

        System.out.print("Enter your accounts number : ");
        float accounts = getSubjectMarks.nextFloat();

        System.out.print("Enter your Maths marks : ");
        float maths = getSubjectMarks.nextFloat();

        System.out.print("Enter your economics marks : ");
        float economics = getSubjectMarks.nextFloat();

        int subjectTotal = (int) (accounts + maths  + economics);
        int percentage = (subjectTotal * 100) / 300;

        System.out.println("Percentage is : " + percentage);

        if (percentage >= 40 && accounts >= 33 && economics >= 33 && maths >= 33){
            System.out.println("You're promoted");
        } else{
            System.out.println("You-re fail");
        }
        question3();
    }
    static void question3(){
        // Question 3; Gst slab Calculator,
        Scanner enterMoney = new Scanner(System.in);
        float tax = 0;
        System.out.print("Enter your income in lakhs : ");
        float income = enterMoney.nextFloat();

        if (income <= 2.5){
            tax = tax + 0;
            System.out.println("Current tax is : " + tax);
        }
        else if (income >= 2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
            System.out.println("You have to pay : " + tax + " as income tax");
        }
        else if (income >= 5f && income <= 10){
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (5.0f - 2.5f);
            System.out.println("You have to pay : " + tax + " as income tax");
        }
        else if(income >= 10.0f){
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (5.0f - 2.5f);
            tax = tax + 0.3f * (income - 10.0f);
            System.out.println("You have to pay : " + tax + " as income tax");
        }

        System.out.println("The total tax of an employee is : " + tax);
        question4();
    }
    static void question4(){
        // Input index to get day name,
        Scanner getNumberDate = new Scanner(System.in);
        System.out.print("Enter your date index : ");
        int enterDate =  getNumberDate.nextInt();

        switch (enterDate) {
            case (1)->{
                System.out.println("Monday");
            } case (2) ->{
                System.out.println("Tuesday");
            } case(3)->{
                System.out.print("Wednesday");
            } case(4)->{
                System.out.print("Thursday");
            } case (5) ->{
                System.out.print("Friday");
            } case  (6) ->{
                System.out.println("Saturday");
            } case  (7) ->{
                System.out.println("Sunday, Holiday!!!!");
            }default -> {
                System.out.println("Sorry dude, By default Days are : 7");
            }
        }
        question5();
    }
    static void question5(){
        // Find whether a year is a leap year or not,
        Scanner enterYear = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int getYear = enterYear.nextInt();
        boolean isCheckLeapYear = new GregorianCalendar().isLeapYear(getYear);

        if (isCheckLeapYear){
            System.out.println("Yup, " + getYear + " Is A leap year");
        } else {
            System.out.println("Nope, " + getYear + " Is not a leap Year");
        }
        question6();
    }
    static void question6(){
        Scanner getWebName = new Scanner(System.in);
        System.out.print("Enter your website url : ");
        String getDomain  = getWebName.nextLine();

        if(getDomain.endsWith(".com")){
            System.out.println("It's a commercial website ");
        } else if (getDomain.endsWith(".org")){
            System.out.println("It's a government service website");
        } else if (getDomain.endsWith(".in")) {
            System.out.println("It's an indian origin website, ( Safe at 80% ) ");
        } else{
            System.out.println("Other, sources website");
        }
    }
}
