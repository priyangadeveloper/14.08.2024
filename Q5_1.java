import java.util.Scanner;

public class Q5_1 {
    public static void main(String args[]){
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Starting number: ");
        int start = sc.nextInt();

        System.out.println("Enter the ending number: ");
        int end = sc.nextInt();

        for(int i=start;i<=end;i++){
            if(i%3==0 && i%5==0){
                System.out.println("The Number is both divisible by 3 & 5 is "+i);

            }

        }
        

    }
}
