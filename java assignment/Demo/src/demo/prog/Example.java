package demo.prog;

class  Stack{
    static final int MAX = 10;
    int top;
    int a[] =  new int[MAX];

    Stack(){
        top = -1;
    }
    boolean push(int x){
        if(top>=(MAX-1)){
            System.out.println(" Stack overflow");
            return false;
        }
        else {
            a[++top]= x;
            System.out.println(x + " push into stack");
            return true;
        }
    }
    int pop(){
        if(top < 0){
            System.out.println(" stack underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
    int peek(){
        if(top < 0){
            System.out.println(" stack underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }
    void display(){
        for (int i = top; i>-1;i--)
        {
            System.out.println("" + a[i]);
        }
    }
}
public class Example {
    public static void main(String [] args){

        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println("top element is :" + s.peek());
        System.out.println("Elements present in stack:" );
        s.display();


    }

}
