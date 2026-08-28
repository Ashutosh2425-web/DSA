public class Array1 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int n=0;
        for(int i=0;i< 10;i++){
            arr[i]=n;
            n++;
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}
