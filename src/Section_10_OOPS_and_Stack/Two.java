package Section_10_OOPS_and_Stack;

public class Two {
    public static void main(String[] args) throws Exception {
        One stack = new One(10);
        for (int i = 1;i<=10;i++){
            stack.push(i);
        }
        stack.display();
        One helperStack = new One(10);
        reverseStack(stack,helperStack,0);
        stack.display();
    }

    public static void reverseStack(One stack, One helperStack, int index) throws Exception{
        if (stack.isEmpty()){
            return;
        }
        int item = stack.pop();
        reverseStack(stack,helperStack,index+1);
        helperStack.push(item);
        if (index==0){
            while (!helperStack.isEmpty()){
                stack.push(helperStack.pop());
            }
        }
    }
}
