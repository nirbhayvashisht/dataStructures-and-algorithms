package Section_10_OOPS_and_Stack;

public class One {
    private int[] data;
    private int top = -1;

    private static final int DEFAULT_CAPACITY= 10;
    //constructor for when the user do not provide capacity
    One(){
        data = new int[DEFAULT_CAPACITY];
    }

    //constructor for when the user provides capacity
    One(int capacity) throws Exception{
        if (capacity<1){
            throw new Exception("Capacity entered is less than 1");
        }
        data = new int[capacity];
    }

    public int size(){
        return this.top+1;
    }

    //is size is 0 then true
    public boolean isEmpty(){
        return this.size()==0;
    }
    public void push(int value) throws Exception{
        if (this.size()==data.length){
            throw new Exception("Stack is full");
        }
        this.top++;
        this.data[this.top]= value;
    }

    public int pop() throws Exception{
        if(this.top == -1){
            throw new Exception("Stack is empty");
        }
        int removedElement = this.data[this.top];
        this.data[this.top] = 0;
        this.top--;
        return removedElement;
    }

    public int top() throws Exception{
        if (this.size()==0){
            throw new Exception("Stack is empty");
        }
        return this.data[this.top];
    }

    public void display(){
        for(int i = this.top;i>=0;i--){
            System.out.print(this.data[i]+", ");
        }
        System.out.println();
    }
}
