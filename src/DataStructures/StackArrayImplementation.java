package DataStructures;

/**
 * Created by pillutja on 4/19/2018.
 */
public class StackArrayImplementation {
    static final int max_size = 100;
    static int[] stack = new int[max_size];
    static int top =-1;

    public static void main(String[] args) {
        push(2);
        printStack();
        pop();
        printStack();
        System.out.println(isEmpty());
        printStack();
        for (int i = 0; i < 9; i++) {
            push(i);
        }
        System.out.println(top());
        printStack();
        pop();
        printStack();
    }

    private static void printStack() {
        if(top == -1)
            System.out.println("Stack under flow");
        else{
            int temp = top;
            for (int i = temp; i > -1 ; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    private static void push(int i) {
        if((top+1)==max_size){
            System.out.println("stack over flow");
        }
        else{
            stack[++top] = i;
        }
    }
    private static void pop() {
        if(top == -1)
            System.out.println("Stack under flow");
        else{
            --top;
        }
    }
    private static boolean isEmpty() {
        return top==-1;
    }
    private static int top() {
        if(top==-1){
            System.out.println("Stack under flow");
            return -100;
        }
        else {
            return stack[top];
        }
    }

}
