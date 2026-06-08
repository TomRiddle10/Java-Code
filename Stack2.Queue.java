import java.util.Stack;
public class Stack2.Queue {
    public class QusingStack{
        Stack<Integer> s=new Stack<>();
        Stack<Integer> s2=new Stack<>();  
        static void enqueue(int val){
            st1.push(val);
            }
        static void dequeue(){
            while(!s.isEmpty()){
                s2.push(s.pop());
            }
            s2.pop();
            while(!s2.isEmpty()){
                s.push(s2.pop());
            }
        }
        }
    
    public static void main(String[] args){

    }
}
//