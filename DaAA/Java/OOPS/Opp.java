// classes in java
// class Pen {
//     // Data of class
//     String color;
//     String type;

//     // This is called Methods in java
//     // also member of class
//     public void writing() {
//         System.out.println(this.color);
//         System.out.println(type);
//         System.out.println("WE are Writing");
//     }
// }

// Constructor 
class Student {
    String name;
    int age;

    // This is called Methods in java
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }
}

public class Opp {
    public static void main(String[] args) {

        // declaring objects of the class
        // Pen Pen1 = new Pen();
        // Pen Pen2 = new Pen();
        // Pen1.color = "Blue";
        // Pen1.type = "ballpoint";
        // Pen2.color = "Black";
        // Pen2.type = "jel ";
        // Pen1.writing();
        // Pen2.writing();

        //////////////// Constructors //////////////////

        // Three types of constructor
        // 1) Non parameterize
        // 2) Parameterize
        // 3) copy constructor

        // 1 type
        // Student s1 = new Student();
        // s1.age = 20;
        // System.out.println(s1.age);
        // s1.name = "Usman";
        // System.out.println(s1.name);

        // 2 type
        // Student s2 = new Student("Usman", 20);
        // // 3 type
        // Student s3 = new Student(s2);
        // s3.printInfo();

        // There is no destructors in java it have garbage collector

    }
}