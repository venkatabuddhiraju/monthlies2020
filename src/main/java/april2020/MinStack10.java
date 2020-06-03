package april2020;

import javax.management.RuntimeErrorException;
import java.util.Stack;

class MinStack10 {

    int min = Integer.MIN_VALUE;
    Stack<Stuff> list = new Stack<>();
    /**
     * initialize your data structure here.
     */
    public MinStack10() {

    }

    public void push(int x) {
        if(list.isEmpty()){
            list.push(new Stuff(x,x));
            min = x;
            return;
        }
        else{
            if(this.getMin() > x){
                min = x;
            }
            list.push(new Stuff(x, this.getMin()));
        }
    }

    public void pop() {
        if(list.isEmpty()){
            return;
        }
        list.pop();
        if(list.isEmpty()){
            return;
        }
        min = list.peek().getMin();
    }

    public int top() {
        return list.peek().getElement();
    }

    public int getMin() {
        if(list.isEmpty()) throw new RuntimeException();
        return min;
    }

    public static void main(String[] dsfd) {
        MinStack10 minStack = new MinStack10();
        minStack.push(2147483646);
        minStack.push(2147483647);
        minStack.push(2147483647);
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

        minStack.pop();
        minStack.push(2147483647);
        System.out.println(minStack.top());

        System.out.println(minStack.getMin());
        minStack.push(-2147483647);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

    }

    class Stuff{
        int element, min = 0;
        Stuff(int element, int min){
            this.element = element;
            this.min = min;
        }
        int getElement(){
            return element;
        }

        int getMin(){
            return min;
        }
    }
}
