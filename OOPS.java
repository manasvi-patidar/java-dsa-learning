//Objects & Classes:

/*public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "ManasviPtidar";
        myAcc.setPassword("abc123*");
    }
}

//Access Modifiers:
class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;
    
    //  Getters:
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    //Setters:
    void setColor(String newColor) {
        this.color  = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}*/

//Constructors:
/*public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Manasvi";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s1.password = "xyz";
        s1.marks[1] = 95;
        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //Copy Constructor:
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    //Non-Parameterized Constructor:
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called!");
    }

    //Parameterized Constructor:
    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}*/

//Inheritance:

/*public class OOPS {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();
    }
}

//Single Level Inheritance:

//Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

//Derived Class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}*/

//Multi Level Inheritance:

/*public class OOPS {
    public static void main(String args[]) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

//Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

//Derived Class
class Mammal extends Animal {
    int legs;
}

//Derived Class
class Dog extends Mammal {
    String breed;
}*/

//Hierarchial Inheritance:

/*public class OOPS {
    public static void main(String args[]) {

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}*/

//Polymorphism:

//Method Overloading: {Compile Time Polymorphism}

/*public class OOPS {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float)1.5, (float)2.5));
        System.out.println(calc.sum(1, 2, 3));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}*/

//Method Overriding: {Run Time Polymorphism}

/*public class OOPS {
    public static void main(String args[]) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}*/

//Abstraction:

/*public class OOPS {
    public static void main(String args[]) { 
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang

    }
}

abstract class Animal {
    String color;

    //Constructor
    Animal() {
        System.out.println("animal constructor called!");
        color = "brown";
    }

    //Non-abstract method
    void eat() {
        System.out.println("animal eats");
    }

    //abstract method
    abstract void walk();
}

//sub-classes
class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called!");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called!");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}*/

//Interfaces:

/*public class OOPS {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();

    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal(by 1 step)");
    }
}*/

//Static Keyword:

/*public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolName = "TKS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";

    }
}

class Student {
    static int returnPercentage(int math, int phy, int chem) { //function is static because formula is same for all students
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName (String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}*/

//Super Keyword:

/*public class OOPS {
    public static void main(String args[]) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor is called!");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "brown"; // immediate parent class is Animal
        System.out.println("horse constructor is called!");
    }
}*/


