package test;

public class Student {

    private int age;
    private String name;


    Student(int age , String name){
        this.age = age;
        this.name= name;

    }
    public void test(){
        System.out.println("age"+this.age + "name"+this.name);
    }
}
