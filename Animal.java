abstract class world1{
    abstract void animal1();
    abstract void animal2();

    void animal3(){
        System.out.println("This animal is Loin");
    }
    void animal4(){
        System.out.println("This animal is Tiger");
    }
}
public class Animal extends world1{
    void animal1(){
        System.out.println("This animal is cheetah");
    }
    void animal2(){
        System.out.println("This animal is leopard");
    }
    public static void main(String[] args){
        Animal a=new Animal();
        a.animal1();
        a.animal2();
        a.animal3();
        a.animal4();
    }
    
}
