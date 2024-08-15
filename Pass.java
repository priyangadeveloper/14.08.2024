import java.util.Scanner;

public class Pass {
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Marks: ");
    int mark = sc.nextInt();

    if(mark>=35){
System.out.println("You are pass");
    }else
    {
System.out.println("You are fail");
    }

// System.out.println("Enter the Your income :");
// int income = sc.nextInt();

// if (income<=7000){
//     System.out.println("You are Eligible for Schorlarship");
// }else{
//     System.out.println("You are Not Eligible for Scholarship");
// }


    }
}
