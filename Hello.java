import java.util.Scanner;
public class Hello {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your age :");

        int age =sc.nextInt();

        System.out.println("The user age is:"+age);
    }
}
