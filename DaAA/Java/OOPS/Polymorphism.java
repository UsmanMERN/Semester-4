// define of Polymorphism in java?
//  When we do same work in different ways in java 

// types of polymorphism
//   ---> 1) compile time polymorphism
//   ---> 2) Run time polymorphism

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + "  " + age);
    }

}

public class Polymorphism {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.printInfo("usman");
        s1.printInfo(20);
        s1.printInfo("usman", 20);
    }

}
