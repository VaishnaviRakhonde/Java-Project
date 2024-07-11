import java.util.Scanner;
public class Calculater
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println("Enter the value of A");
        int NumberA =sc.nextInt();
        System.out.println("Enter the value of B");
        int NumberB =sc.nextInt();
        char operater=sc.next() . charAt(0);
        switch(operater)
        {
            case'+':
            System.out.println(NumberA+NumberB);
            break;
            case'-':
            System.out.println(NumberA-NumberB);
            break;
            case'*':
            System.out.println(NumberA*NumberB);
            break;
            case'/':
            System.out.println(NumberA/NumberB);
            break;
            case'%':
            System.out.println(NumberA%NumberB);
            break;
            default:
            System.out.println("Invalid operater");

        }
    }
}