import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array elements are:");

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}

