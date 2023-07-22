// abstract class Animal {
//     abstract void walk();

//     public void eat() {
//         System.out.println("Animal Eating");
//     }

//     Animal() {
//         System.out.println("Animal constructor is called !");
//     }
// }

// class Horse extends Animal {
//     public void walk() {
//         System.out.println("Walking on Four Legs");
//     }

//     Horse() {
//         System.out.println("Horse constructor is called!");
//     }
// }

// class Hen extends Animal {
//     public void walk() {
//         System.out.println("Walking on Two Legs");
//     }
// }

// Interfaces?

// types
//  ---> public
//  ---> static
//  ---> final
//  ---> default

// multiple inheritance is not done by classes in java but implemented by   interfaces  

interface Animal {
    int eyes = 2;

    public void walk();
}

interface Herbivore {
    void eat();

}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Walking on Four Legs");
    }

    public void eat() {
        System.out.println("Eat Green plants");

    }
}

public class Encapsulation {

    public static void main(String[] args) {
        // what is Encapsulation?
        // Encapsulation in Java is a process of wrapping code and data together into a
        // single unit, for example, a capsule which is mixed of several medicines.

        // data hiding
        // data hiding is the process of Protecting the important members of class from
        // from the unintended changes whereas, abstraction is the hiding implementation
        // details
        // and showing only useful/Important [arts to the users]

        // Abstraction

        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
        // Hen h2 = new Hen();
        // h2.walk();
    }
}