public class StaticPractice {
    static{
        System.out.println("Static block");
    }
    {
        int a =7;
        System.out.println("Instance block");
    }
    public static void main(String[] args) {
        Student1 student1 = new Student1(1,"Jana");
        Student1 student2 = new Student1(2,"Jana");
        Student1 student3 = new Student1(3,"Jana");
        student1.display();
        Student1.change();
        student1.display();
        student2.display();
        Student1 student11 = new Student1();
        System.out.println(student1.Student1(6));
        //System.out.println(this);
        //StaticPractice staticPractice = new StaticPractice();
    }
    static void print(){
        System.out.println("Print method of StaticPractice");
    }
    void print1(Student1 student1){
        System.out.println("Print method of StaticPractice");
        student1.useThis(this);
    }
    StaticPractice(){
        Student1 student1 = new Student1();
        student1.useThis(this);
    }
}

class Student1{
    int id;
    String name;
    static String college = "IIIT RKV";
    static void change(){
        college="IIIT Nuz";
    }
    void useThis(StaticPractice staticPractice){
        staticPractice.print();
    }
    void display(){
        System.out.println("Student ID:"+id+" Name:"+name +" College:"+college);
    }
    Student1(int id,String name)
    {
        this();
        this.id=id;
        this.name= name;
    }
    Student1(){
        /*this(1,"Raj");*/
    }
    public String Student1(int x){
        System.out.println("method of Constructor overloading"+x);
        return "Jana";
    }
}