package Lesson17;

public class Person {
    String fullName;
    int age;

    public Person(){
        fullName = "";
        age = 0;
    }

    public Person(String fullName, int age){
        this.fullName=fullName;
        this.age=age;
    }

    public move(){
        System.out.println("Такой-то " + fullName + " говорит:");
    }

    public talk(){
        System.out.println("Такой-то " + fullName + " говорит:");
    }
}
