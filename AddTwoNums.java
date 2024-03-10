import java.util.Scanner;
class AddTwoNums
{
    public static void main(String[] args) 
    {
        AllFuncs TotalNums = new AllFuncs();
        int total = TotalNums.GetNums();

        System.out.println("\nThe total of two numbers are: " + total + ".\n");
    }
}

class AllFuncs
{
    public int GetNums(){
        Scanner GetNum = new Scanner(System.in);
        
        System.out.println("\nEnter the first number: ");
        int Num1 = GetNum.nextInt();

        System.out.println("\nEnter the second number: ");
        int Num2 = GetNum.nextInt();

        int Total = Num1 + Num2;

        GetNum.close();
        return Total;
    }
}
