class Poly2{
    static int add(int a,int b){
    int c=0;
    c=a*b;
    return c;
}
}

public class Poly1 extends Poly2{
    static int add(int a,int b){
            return a+b;
        }
        static double add(double a, double b){
            return a+b;
        }

    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(add(5.0,6.0));
        Poly1 p=new Poly1();
        System.out.println(add(3, 4));
        Poly2 p1=new Poly2();
        System.out.println(p1.add(3, 4));
    }    
}
