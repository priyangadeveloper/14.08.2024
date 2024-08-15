import java.util.Scanner;

public class Check {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();


        // if(num % 3 == 0 && num % 5 == 0){
        //     System.out.println(" Number"+num+ "is Divible  by both 3 and 5");

        // }else{
        //     System.out.println(" Number "+num+"is  Not Divible  by both 3 and 5");
        // }

        if(num % 2 ==0){
            System.out.println("This is Even number");
        }else {
            System.out.println("This is Odd Number");
        }


    }
}
