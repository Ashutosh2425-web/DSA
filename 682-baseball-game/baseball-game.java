class Solution {
    public int calPoints(String[] operations) {
        int[] stack=new int[operations.length];
        int top=-1;

        for(String op:operations){
            if(op.equals("C")){
                top--;
            }else if(op.equals("D")){
                top++;
                stack[top]=2* stack[top-1];
            }else if(op.equals("+")){
                top++;
                stack[top]=stack[top - 1]+stack[top -2];
            }else{
                top++;
                stack[top]=Integer.parseInt(op);
            }
        }
        int sum=0;
        for(int i=0; i <= top;i++){
            sum +=stack[i];
        }
        return sum;
    }
}