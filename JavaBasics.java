//Input:

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //String input = sc.next();  //for single word
        //System.out.println(input);

        //String name = sc.nextLine();  //for multiple words
        //System.out.println(name);

        //int number = sc.nextInt();  //for storing integer value
        //System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);
    }
}*/

//Sum of a & b:

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}*/

//Area of a Circle:

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
    }
}*/

//Type Casting

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = 25.12f;
        int b = (int) a;
        System.out.println(b);
    }
}*/

//Conditional Statements:

//if-else

/*public class JavaBasics {
    public static void main(String args[]) {
        int age = 16;
        if(age >= 18) {
            System.out.println("adult");
        }
        if(age > 13 && age < 18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("Not adult");
        }
    }
}*/

//Print the largest of two numbers A = 1, B = 3.

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        int A = 2;
        int B = 5;

        if(A > B) {
            System.out.println("A is largest of 2");
        } else {
            System.out.println("B is largest of 2");
        }
    }
}*/

//Print if a number is Odd or Even.

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}*/

//else-if

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        int age = 13;

        if(age >= 18) {
            System.out.println("Adult");
        }
        else if(age >= 13 && age < 18) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Child");
        }
    }
}*/

//Income Tax Calculator:

/*income < 5L
0% tax

income between 5-10L
20% tax

income > 10L
30% tax*/

/*import java.util.*;

public class JavaBsics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income < 500000) {
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        }
        else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is : " + tax);
    }
}*/

//Print the largest of 3 numbers A = 1, B = 3, C = 6.

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        int A = 1, B = 3, C = 6;

        if((A >= B) && (A >= C)) {
            System.out.println("Largest is A");
        }
        else if(B >= C) {
            System.out.println("Largest is B");
        }
        else {
            System.out.println("Largest is C");
        }
    }
}*/

//Ternary Operator:

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        int number = 4;

        //ternary operator
        String type = ((number%2) == 0) ? "Even" : "Odd";
        System.out.println(type);
    }
}*/

/*Check if a student will Pass or Fail:
marks >= 33 : Pass
marks < 33 : Fail*/

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        int marks = 68;

        String reportCard = marks >= 33 ? "PASS" : "FAIL";
        System.out.println(reportCard);
    }
}*/

//Switch Statement:

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        int number = 2;
        switch(number) {
            case 1 : System.out.println("Samosa");
                     break;
            case 2 : System.out.println("Burger");
                     break;
            case 3 : System.out.println("Mango shake");
                     break;
            default : System.out.println("We wake up");
        }
    }
}*/

//Calculator: {+,-,*,/,%}

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        System.out.println("enter operator : ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b);
                         break;
            case '-' : System.out.println(a-b);
                         break;     
            case '*' : System.out.println(a*b);
                         break;
            case '/' : System.out.println(a/b);
                         break;
            case '%' : System.out.println(a%b);
                         break;   
            default : System.out.println("Wrong Operator");                                     
        }
    }
}*/

//Loops:

//while loop:-

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        int counter = 0;
        while(counter < 10) {
            System.out.println("Hello World");
            counter++;
        }

        System.out.println("Printed Hello World 10x");
    }
}*/

//Print numbers from 1 to 10 using while loop.

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        int counter = 1;
        while(counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }
}*/

//Print the numbers from 1 to n.

/*import java.util.Scanner;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;

        while(counter <= range) {
            System.out.print(counter+ " ");
            counter++;
        }
        System.out.println();
    }
}*/

//Print the sum of first n natural numbers. {n=5}

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i=1;
        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println("sum is "+ sum);
    }
}*/

//for loop:-

//Print Square Pattern.

/*public class JavaBasics {
    public static void main(String args[]) {
        for(int line=1; line<=4; line++) {
            System.out.println("****");
        }
    }
}*/

//Print reverse of a number.

/*NOTE:: 
last digit : num % 10
remove last digit : num/10 */

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        int n = 10899;

        while(n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10; //n/=10
        }
        System.out.println();
    }
}*/

//Reverse the given number. 

/*NOTE:: 
formula: rev = (rev*10)+lastDigit */

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        int n = 10899;
        int rev = 0;

        while(n > 0) {
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}*/

//do while loop:-

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        int counter = 1;
        do {
            System.out.println("Hello World");
            counter++;
        } while(counter <= 10);
    }
}*/

//Break Keyword: {to exit the loop}

//Keep entering numbers till user enter a multiple of 10.

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("enter your number : ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while(true);
    }
}*/

//Continue Keyword: {to skip an iteration}

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        for(int i=1; i<=5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}*/

//Display all numbers entered by user except multiples of 10.

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("enter your number : ");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                continue;
            }
            System.out.println("number was : "+ n);
        }while(true);
    }
}*/

//Check if a number is prime or not.

/*NOTE:: 
prime: n = nx1 & 1xn*/

/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) { //square root of n {n = root n * root n}
                if (n % i == 0) { // n is a multiple of i (i not equal tp 1 or n)
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
            sc.close();
        }
    }
}*/
