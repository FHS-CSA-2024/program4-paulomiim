//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Program4 {
    public static void main (String[] args){
        //assign variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        double sum = 0;
        double avg = 0;
        //create scanner
        Scanner numScanner = new Scanner (System.in);
        //user input
        System.out.println("Enter the first number ");
        num1 = numScanner.nextInt();
        System.out.println("Enter the second number ");
        num2 = numScanner.nextInt();
        System.out.println("Enter the third number ");
        num3 = numScanner.nextInt();
        System.out.println("Enter the fourth number ");
        num4 = numScanner.nextInt();
        //calculate
        sum = num1 + num2 + num3 + num4;
        avg = sum / 4;
        //print
        System.out.println("The sum of the four numbers is " + (int) sum);
        System.out.println("The average of the four numbers is " + avg);
    }
}



//Paste console output below:
/*
Enter the first number 
475
Enter the second number 
821
Enter the third number 
369
Enter the fourth number 
562
The sum of the four numbers is 2227
The average of the four numbers is 556.75



*/
