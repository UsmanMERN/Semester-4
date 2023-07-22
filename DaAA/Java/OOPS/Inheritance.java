// Inheritance 
// passing the properties of oe class to the other class 

// types
//  --> single Level Inheritance
//  --> Multi Level Inheritance
//  --> Hierarchial Level Inheritance
//  -->  Hybrid Inheritance

//////////////////////   Packages /////////////////////////
// import bank.*;

class Shape {

    public void area() {
        System.out.println("Area of the shape");
    }
}

class Triangle extends Shape {
    public void area(int l, int w) {
        System.out.println("Area of the triangle is " + l * w);
    }

}

class EquilateralTriangle extends Triangle {
    public void area(int l, int w, int h) {
        // super.area(l, w);
        System.out.println("Area of the equiterial triangle is " + l * w * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println("Area of the circle : " + (int) ((3.14) * r * r));
    }
}

public class Inheritance {
    public static void main(String args[]) {
        // Single level inheritance
        // Triangle T1 = new Triangle();
        // T1.area();
        // T1.area(2, 5);

        // MultiLevel Inheritance
        // EquilateralTriangle ET = new EquilateralTriangle();
        // ET.area();
        // ET.area(20, 12);
        // ET.area(20, 12, 10);

        // Hierarchial Inheritance
        // Circle C = new Circle();
        // C.area();
        // C.area(89);

        // when Two or more derived classes have same parent then this type of
        // inheritance is called Hierarchial

        // Hybrid Inheritance?
        // Different types of inheritance like single and multiple is used

        /////////////////////// Packages /////////////////////////////
        

    }
}
