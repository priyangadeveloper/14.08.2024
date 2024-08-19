import java.util.Scanner;

public class Q2 {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Starting number To find the Even number: ");
        int start = sc.nextInt();

        System.out.println("Enter the Ending Number to find the Even Number: ");
        int end = sc.nextInt();

        System.out.println(start+" to "+end +" Even number are: ");

        for(int i=start;i<=end;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
