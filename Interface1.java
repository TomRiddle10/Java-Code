interface Inter1{
   void pay();
   default void display(){
         System.out.println("This is display method of Inter1");
   }
}

interface Inter2{
    void pay(); 
    default void display(){
        System.out.println("This is display method of Inter2");
    }
}
class UPI implements Inter1,Inter2{
    public void pay(){
        System.out.println("Payment done by UPI");
    }
    public void display(){
        Inter2.super.display();
        Inter1.super.display();
}
}
public class Interface1 {
    public static void main(String[] args) {
        Inter2 n=new UPI();
        n.display();
}
}
