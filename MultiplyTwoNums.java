import java.util.Scanner;
public class MultiplyTwoNums 
{
    public static void main(String[] args) 
    {
        GetTwoNums twoNums = new GetTwoNums();

        double TimesTwoNums = twoNums.TwoNums();
        System.out.println("\nThe multiplication of two numbers are: " + TimesTwoNums + "\n");
    }    
}

class GetTwoNums
{
    public double TwoNums()
    {

        Scanner MultiTwo = new Scanner (System.in);

        System.out.println("\nEnter the first number: ");
        double FirstNum = MultiTwo.nextDouble();

        System.out.println("\nEnter the second number: ");
        double SecondNum = MultiTwo.nextDouble();

        double TimesTwoNums = FirstNum * SecondNum;
        MultiTwo.close();

        return TimesTwoNums;
    }
}