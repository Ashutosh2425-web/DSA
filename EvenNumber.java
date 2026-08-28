import java.util.Scanner;
public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the even numbers:");
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i < n ; i++){
            int e=sc.nextInt();

            if(e %2==0){
                arr[i]=e;
            }else{
                System.out.println("Only enter the even no ");
                i--;
            }
        }
        System.out.println("Elements:");
        for(int i=0;i< n;i++){
            System.out.println(arr[i]);
        }
    }
}
