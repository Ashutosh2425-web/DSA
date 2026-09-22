import java.util.Scanner;

class PerfectNumber{
    static boolean checkPerfectNumber(int num){
        int sum=0;
        for(int i=1;i<= num/2;i++){
            if(num % i==0){
                sum=sum+i;
            }
            if(sum!=num){
                return false;
            }
        }
        return true;
    }
}