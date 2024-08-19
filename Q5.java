import java.util.Scanner;

public class Q5 {
    public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the starting Number: ");
int start = sc.nextInt();

System.out.println("Enter the Ending Number: ");
int end = sc.nextInt();

int count = 0;

for(int i=start;i<=end;i++){
    if (i%2 ==0){
    }else{
        count++;
    }

}
System.out.println("The total odd number are from "+start+" to "+end+" is: "+count);

    }
}
