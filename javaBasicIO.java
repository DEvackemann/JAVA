// take user input
import java.util.Scanner;
class javaBasicIO {
    public static void main (String [] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = Input.nextInt();
        System.out.println("You enter the number " + number);
        Input.close();
    }
} 
