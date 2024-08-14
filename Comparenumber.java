
import java.util.*;


public class Comparenumber {

    public static void main(String args[]){
      
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int num2= sc.nextInt();

if (num1==num2){
    System.out.println("Both the Number should be Equal");

}else if (num1>num2) {
    System.out.println("The Greatest Number is :"+ num1);
    
} else {
    System.out.println("The Greatest Number is :"+ num2);
}


    }
    
}
