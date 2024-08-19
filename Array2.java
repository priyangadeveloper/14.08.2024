import java.util.Scanner;

public class Array2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to get the elements");
        int num = sc.nextInt();

        int arr[] =new int[num];

        System.out.println("Enter the Elements: ");

        for(int i=0;i<arr.length;i++){
        arr[i] = sc .nextInt();

        }
        System.out.println("THe elements of the array is: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
