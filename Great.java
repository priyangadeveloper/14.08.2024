import java.util.Scanner;

public class Great {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Number2:");
        int num2 = sc.nextInt();



        String result = (num1>num2?"The greatest number is "+num1:"The greatest number is "+num2);
        System.out.println(result);

    }
    
}
