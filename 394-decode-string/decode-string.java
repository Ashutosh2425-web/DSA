class Solution {
    public String decodeString(String s) {
        Stack<Integer> numberStack=new Stack<>();
        Stack<String> stringStack=new Stack<>();

        String currentString="";
        int currentNumber=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                currentNumber=currentNumber * 10 + (ch - '0');
            }else if(ch == '['){
                numberStack.push(currentNumber);
                stringStack.push(currentString);

                currentNumber=0;
                currentString="";

            }else if(ch == ']'){

                int repeat=numberStack.pop();
                String previousString=stringStack.pop();

                String temp="";

                for(int j=0;j< repeat;j++){
                    temp=temp+currentString;
                }
                currentString=previousString+temp;
            }else{
                currentString=currentString + ch;
            }
        }
        return currentString;
    }
}