import java.util.Scanner;

public class Calculate {
    public static void main(String[] args){
       int total, score; 
       float percentage;
       Scanner inputNumScanner = new Scanner(System.in);
       
       System.out.println("Enter the total, or max, score: ");       
       total = inputNumScanner.nextInt();
       
       System.out.println("Enter the score obtained: ");
       score = inputNumScanner.nextInt();
       
       percentage = (score * 100/ total);
       
       System.out.println("The percentage is = " + percentage + " %");
    }
}