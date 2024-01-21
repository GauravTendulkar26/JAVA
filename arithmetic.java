import java.util.Scanner;
class arithmetic 
{
    public static void main(String arr[])
    {
        int a , b ; 
        System.out.print("Enter the two nos");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("addition is "+(a+b));
        System.out.println("subtraction is "+(a-b));
        System.out.println("multiplication is "+(a*b));
        System.out.println("Division is "+(a/b));
    }
}