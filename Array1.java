import java.util.Scanner;

public class Array1 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int arr[]= new int[num];
        int sum=0;

 
System.out.println("Enter the  Elements of the array is: ");
        for (int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();

        }

        System.out.println("The sum or total value of Array is: ");

        for(int i=0;i<arr.length;i++){
            sum= arr[i]+sum;

            
        }
        System.out.println(sum);
        
    }
}
