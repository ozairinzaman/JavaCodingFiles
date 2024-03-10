class CarClassNMethodApp 
{
    public static void main(String[] args) 
    {
        
        SecondClass MyCar = new SecondClass();
        MyCar.Message();

        MyCar.Speed(200);
    }
}

class SecondClass {
    public void Message() {
        System.out.println("\nThe car is going very fast as it can!");
    }

    public void Speed(int MaxSpeed) {
        System.out.println("\nMax Speed is: " + MaxSpeed + ".\n");
    }
}
