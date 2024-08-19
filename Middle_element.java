import java.util.Scanner;

public class Middle_element {

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
System.out.println("Enter the Size of an Array: ");
int size = sc.nextInt();

int arr[]=new int[size];

System.out.println("Enter the Elements of the array: ");
for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}


    System.out.println("Middle of the array is: "+arr[arr.length/2]);


    }

    
}
