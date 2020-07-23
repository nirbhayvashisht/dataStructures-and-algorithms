package Section_10_OOPS_and_Stack;

public class OneClient {
    public static void main(String[] args) throws Exception{
        One stack = new One(5);
        System.out.println("Size: "+stack.size());
       // System.out.println("Top: "+stack.top());
        stack.push(4);
        stack.push(5);
        stack.display();
        System.out.println("Popped: "+stack.pop());
        stack.push(6);
        stack.push(10);
        stack.push(1);
        stack.display();
        //stack.push(9);
    }
}
