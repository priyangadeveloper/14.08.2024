
import java.util.*;
public class Q4 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary: ");
        int salary = sc.nextInt();

        System.out.println("Enter the age: ");
        int age =sc.nextInt();

        int amount;

        if (salary >=20000 || age <=25){
            System.out.println("Enter the Required loan Amount: ");
            
          amount = sc.nextInt();

          if(amount <= 50000){
System.out.println("You are eligible for loan");
          }
          else{
            System.out.println("Maximum loan amount is 50000");
          }
        }
        
        else{
            System.out.println("You are not eligible for loan");
        }

    }
    
}
