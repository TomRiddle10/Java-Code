class Student{
    private int rollNo;
    private String Name;
    private int age;
    private String Course;

    int getrollNO(){
        return this.rollNo;
    }
    void setrollNo(int r){
        this.rollNo=r;
    }

    String getName(){
        return this.Name;
    }
    void setName(String e){
        this.Name=e;
    }

    int getAge(){
        return this.age;
    }
    void setAge(int t){
        this.age=t;
    }

    String getCourse(){
        return this.Course;
    }
    void setCourse(String c){
        this.Course=c;
    }


    void eat(){
        System.out.println("Eating");
    }
    void study(){
        System.out.println("Study");
    }
}

public class Encaps1 {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Ziya Attar");
        System.out.println(s.getName());
    }
}
