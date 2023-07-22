import java.util.Arrays;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class First {
    public static void main(String[] args) {

        // How to print in java
        // System.out.println("Hello java!");
        // System.out.println("Usman");

        // String name = "Muhammad";
        // String secondName = " Usman";
        // System.out.println(name + secondName);

        // types in java

        // two types

        // 1 ) Primitive type

        // Here WE just store simple data values
        // Byte - 1 [-128 127]
        // Short - 2
        // int - 4 ---> 1,2,3,4 ....
        // long - 8
        // float - 4 [3.14 ,]
        // char - 2 a, b,c
        // double - 8
        // boolean - 1 true / false

        // They have fixed length or capacity in memory where they stored

        // byte age = 12;
        // int phone = 1234567890;
        // Long phone2 = 1234567890L;
        // float num = 3.14F;
        // char ch = '$';
        // boolean isAdult = true;
        // System.out.println(age + " --> " + phone + " --> " + phone2 + " --> " + ch +
        // " --> " + num);
        // System.out.println(isAdult);

        // 2) Non-Primitive type

        // Here WE just store Complex objects data and values
        // they have their own methods on which we perform operations

        // they don't have fixed size they modified according to the given values

        // String name = "Muhammad Usman";
        // System.out.println(name.length());

        // WE create non-reference or Non-Primitive data types by using { NEW } Key Word

        ////////////////// String Method ////////////////////////

        // String name = new String("Muhammad Usman");
        // String friend = new String("Saim");
        // System.out.println(name );
        // System.out.println(friend);

        // String name = "Usman and Shani";
        // String firstName = "Muhammad";

        // System.out.println(name.charAt(4));
        // System.out.println(name.length());
        // System.out.println(name.replace(name, firstName));
        // System.out.println(name.substring(0, 5));

        ////////////////// Array Method ////////////////////////

        // int[] marks = new int[4];
        // marks[0] = 50;
        // marks[1] = 54;
        // marks[2] = 10;
        // marks[3] = 59;
        // // System.out.println(marks[0]);

        // // -------> length
        // // System.out.println(marks.length);

        // // ----> sort
        // System.out.println(marks[0]);
        // Arrays.sort(marks);

        // // ----> reverse
        // // System.out.println(Arrays.toString(marks));
        // System.out.println(marks[0]);

        // --> 1D arrays
        // int[] marks={12,23,43,12};
        // System.out.println(marks[0]);

        // --> 2D arrays

        // int[][] finalMarks = { { 34, 32, 12, 54 }, { 98, 76, 67, 87 } };
        // System.out.println(finalMarks[0][0]);

        ///////////////////////// casting /////////////////////

        // casting in java?
        // double price = 100.00;
        // double finalPrice = price + 100;
        // System.out.println(finalPrice);

        // int p = 100;
        // int fp = p + (int) 18.122;
        // System.out.println(fp);

        ///////////////////////// Constant /////////////////////

        // int age = 19;
        // age = 20;
        // System.out.println(age);

        // final float PI = 3.14F;
        // // PI = 3.43;
        // System.out.println(PI);

        ///////////////////////// Operators /////////////////////

        // 1) Arithmetic Operators
        // 2) Assignment Operators
        // 3) Logical Operators
        // 4) comparison Operators

        // -----> Arithmetic operator

        // int a = 4;
        // int b = 9;
        // int sum = a + b;
        // System.out.println(sum);

        // double a = 80;
        // double b = 9;
        // double division = (a / b);
        // System.out.println(division);

        // double a = 5;
        // double b = 3;
        // double modulo = (a % b);
        // System.out.println(modulo);

        ///////////////////////// Maths /////////////////////

        // int a = 4;
        // int b = 9;
        // System.out.println(Math.max(a, b));
        // System.out.println(Math.min(a, b));
        // System.out.println((int) (Math.random() * 100));
        // math random in java?

        // double random = Math.random() * 49 + 1;

        // int random = (int) (Math.random() * 100 + 1);
        // System.out.println(random);
        // System.out.println((int) (Math.random() * 100));

        ///////////////////////// Take Input /////////////////////

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number: ");
        // float num = sc.nextFloat();
        // System.out.println("Enter another number: ");
        // int num2 = sc.nextInt();
        // System.out.println(num + " + " + num2 + " = " + (num + num2));

        // System.out.println("Enter your Name :");
        // String name = sc.next();
        // System.out.println("Hello " + name);

        // ///////////////////// Comparison operator ///////////////////

        // ---> equal
        // a == b
        // ---> Not equal
        // a != b
        // ---> a is greater than b
        // a > b
        // ---> a is less than b
        // a < b
        // ---> a is greater than equal to b
        // a >= b
        // ---> a is less than equal to b
        // a <= b

        // ///////////////////// Conditional operator ///////////////////

        // ---> if
        // int a = 8;
        // int b = 9;
        // if (a == b) {
        // System.out.println("a is equal to b");
        // } else {
        // System.out.println("a is not equal to b");
        // }

        // int age = 40;
        // if (age >= 18) {
        // System.out.println("You are eligible to vote");
        // } else {
        // System.out.println("You are not eligible to vote");
        // }

        // ///////////////////// Logical operator ///////////////////

        // ---> &&

        // int a = 30;
        // int b = 60;
        // if (a < 50 && b < 50) {
        // System.out.println("Both values are less than 50");
        // }else{
        // System.out.println("at least values are greater than 50");
        // }

        // ----> ||

        // int a = 51;
        // int b = 60;
        // if (a < 50 || b < 50) {
        // System.out.println("at Least one values is less than 50");
        // } else {
        // System.out.println("Both values are greater than 50");
        // }

        // boolean isAdult = false;
        // if (!isAdult) {
        // System.out.println("is Adult");
        // } else {
        // System.out.println("You are not Adult");
        // }

        // ------> Logical

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your money");
        // int money = sc.nextInt();
        // int pen = 50;
        // int pencil = 20;
        // System.out.println("Pen ---> " + pen);
        // System.out.println("pencil ---> " + pencil);

        // if (money < 20) {
        // System.out.println("You can't buy money less than 20");
        // } else if (money >= 20 && money < 50) {
        // System.out.println("You can buy only pencil");
        // } else if (money >= 50 && money < 70) {
        // System.out.println("You can buy only pen");
        // } else {
        // System.out.println("You can buy both pencil and pen");
        // }

        // ----------> switch //////////////////////////////

        // int days;
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the number of days");
        // days = sc.nextInt();
        // switch (days) {
        // case 1:
        // System.out.println("Sunday");
        // break;
        // case 2:
        // System.out.println("Monday");
        // break;
        // case 3:
        // System.out.println("Tuesday");
        // break;
        // case 4:
        // System.out.println("Wednesday");
        // break;
        // case 5:
        // System.out.println("Thursday");
        // break;
        // case 6:
        // System.out.println("Friday");
        // break;
        // case 7:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("Invalid day");
        // break;
        // }

        // ----------> Loops //////////////////////////////

        // -----> for

        // for (int i = 0; i <= 10; i++) {
        // System.out.println("--->" + i);
        // }
        // for (int i = 10; i >= 0; i--) {
        // System.out.println("--->" + i);
        // }

        // ----> while
        // int i = 0;
        // while (i <= 10) {
        // System.out.println("--->" + i);
        // i++;
        // }

        // Scanner sc = new Scanner(System.in);
        // int number = 0;
        // do {
        // System.out.println("Enter a number: ");
        // number = sc.nextInt();
        // System.out.println("Your number is " + number);
        // } while (number != 0 && number > 0);
        // System.out.print("The End!");

        // ----------> Break & continue //////////////////////////////

        // / ----> Break
        // int i = 0;
        // while (true) {
        // System.out.println(i++);
        // if (i == 5) {
        // break;
        // }
        // }

        // ------> Continue

        // int i = 0;
        // while (true) {
        // if (i == 3) {
        // i++;
        // continue;
        // }
        // System.out.println(i++);
        // if (i == 5) {
        // break;
        // }
        // }

        /////////////////////// try catch - Exception handling in
        /////////////////////// java//////////////////////////////

        // int[] arr = { 34, 44, 54 };
        // try {
        // System.out.println(arr[9]);
        // } catch (Exception e) {
        // // TODO: handle exception
        // System.out.println(e.getMessage());
        // }
        // System.out.println("I am Doing this ! ");

        // //////////// Methods/Functions in java /////////////////

        
    }

}