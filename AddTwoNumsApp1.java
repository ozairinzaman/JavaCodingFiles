import java.util.Scanner;
public class AddTwoNumsApp1 {

    public static void main(String[] args) {
     
        Scanner Sum2Nums = new Scanner(System.in);

        System.out.println("\nEnter the first number: ");

        int FirstNum = Sum2Nums.nextInt();

        System.out.println("\nEnter the second number: ");
        int SecondNum = Sum2Nums.nextInt();

        int Total = FirstNum + SecondNum;
        
        System.out.println("\nThe total of 2 numbers are: "+ Total + ".\n");
        Sum2Nums.close();
        
    }
}