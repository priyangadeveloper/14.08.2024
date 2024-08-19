import java.util.Scanner;

public class Table {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Table:");
        int num = sc.nextInt();

        System.out.print(num+" Table upto ");
        int a =sc.nextInt(); 

        int arr[] = new int[a];
        System.out.println(num+" Table are ");

        for(int i=1;i<=arr.length;i++){

            System.out.println(i +" x "+num+" = "+i*num);

        }





    }
}
