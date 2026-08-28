import java.util.Scanner;
public class GreatestValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int greatest=Integer.MIN_VALUE;

        System.out.println("Enter :");
        for(int i=1;i<=10;i++){
            int number=sc.nextInt();


            if(number > greatest){
                greatest=number;
            }
        }
        System.out.println("greatest number"+greatest);
        sc.close();
    }
}
