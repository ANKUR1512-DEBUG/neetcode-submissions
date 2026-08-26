class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int a=operations.length;
        
        for(int i=0;i<a;i++){
            if(isNumber(operations[i])){
                stack.push(Integer.parseInt(operations[i]));
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                int t=stack.peek();
                int z=t*2;
                stack.push(z);
            }
            else if(operations[i].equals("+")){
                int x=stack.pop();
                int y=stack.peek();
                int sum=x+y;
                stack.push(x);
                stack.push(sum);
            }
        }
        int finalSum=0;
        for(int k=0;k<stack.size();k++){
                int n=stack.get(k);
                finalSum=n+finalSum;


            }return finalSum;
    }
    private boolean isNumber(String s){
        try{
            Integer.parseInt(s);
            return true;
            
        }
        catch(NumberFormatException e){
            return false;

        }
    }
}