//Average of 3 numbers A, B & C.

/*import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int average = (A + B + C) / 3;

        System.out.println("Average is : " + average);
    }
}*/

//Area of Square:

/*import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of the square is : " + area);
    }
}*/

//Enter the cost of 3 items and print their total cost as output including 18% GST.

/*import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        System.out.println("Bill is : " + total);

        float newTotal = total + (0.18f * total);

        System.out.println("Bill with 18% tax is : "+ newTotal);

    }
}*/

//WAP to print whether a number entered by the user is Positive or Negative.

/*import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x >= 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }
}*/

//WAP which prints you have fever if the temperaure is above 100 and otherwise prints you don't have fever.

/*public class Solution {
    public static void main(String args[]) {
        double temp = 103.5;

        if(temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
    }
}*/

//WAP to print days of week using switch case.

/*import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter week number(1-7): ");
        int week = sc.nextInt();
        

        switch(week) {
            case 1 : System.out.println("Monday");
                     break;
            case 2 : System.out.println("Tuesday");
                     break;
            case 3 : System.out.println("Wednesday");
                     break;     
            case 4 : System.out.println("Thursday");
                     break;
            case 5 : System.out.println("Friday");
                     break;
            case 6 : System.out.println("Saturday");
                     break;
            case 7 : System.out.println("Sunday");
                     break;
            default : System.out.println("not a valid day!");                                                      

        }
    }
}*/

//WAP that takes a year from the user and print whether that year is a leap year or not.

/*import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the year: ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if(x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}*/

//Loops:

//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

/*import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the number: ");
            number = sc.nextInt();

            if(number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.print("Do you want to continue? Press 1 for yes or 0 for no");

            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}*/

//Write a program to find the factorial of any number entered by the user.{n = n*(n-1)*(n-2)*(n-3)*...}

/*import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num; //to hold number
        int fact =1; //to hold factorial

        System.out.print("Enter any positive integer: ");
        num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }
}*/

//Write a program to print the multiplication table of a number N, entered by the user.

/*import java.util.*;

class Solution {
    public static void printMultiplicationTable(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
    public static void main(String args[]) {
        printMultiplicationTable(5);
    }
}*/

//Patterns:

//Print Bottom Left Triangle Pattern.

/*public class Solution {
    public static void main(String args[]) {
        int n = 5; 

        for(int row=1; row<=n; row++) {
            for(int col=1; col<=n; col++) {
                if(row - col >= 0) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}*/

//Print Top Right Triangle Pattern.

/*public class Solution {
    public static void main(String args[]) {
        int n = 5;

        for(int row=1; row<=n; row++) {
            for(int col=1; col<=n; col++) {
                if(row - col <= 0) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}*/

//Print Top Left Triangle Pattern.

/*public class Solution {
    public static void main(String args[]) {
        int n = 5;

        for(int row=1; row<=n; row++) {
            for(int col=1; col<=n; col++) {
                if(row + col <= n + 1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}*/

//Print Bottom Right Triangle Pattern.

/*public class Solution {
    public static void main(String args[]) {
        int n = 5;

        for(int row=1; row<=n; row++) {
            for(int col=1; col<=n; col++) {
                if(row + col >= n + 1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}*/

//Print X-Pattern.

/*public class Solution {
    public static void main(String args[]) {
        int n = 5;

        for(int row=1; row<=n; row++) {
            for(int col=1; col<=n; col++) {
                if(row - col == 0 || row + col == n + 1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}*/

//Print Floyd's Triangle Pattern.

/*public class Solution {
    public static void main(String args[]) {
        int n = 5;

        int val = 1;
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=n; col++) {
                if(row - col >= 0) {
                    System.out.print(val + " ");
                    val++;
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}*/

//Other Pattern Problems:

/*public class Solution {
    public static void main(String args[]) {
        for(int i=5; i>=1; i--) {
            for(int j=5; j>=i; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/

/*public class Solution {
    public static void main(String args[]) {
        for(int i=1; i<=5; i++) {
            for(int x=5; x>i; x--) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/

/*public class Solution {
    public static void main(String args[]) {
        for(int i=5; i>=1; i--) {
            for(int x=1; x<i; x++) {
                System.out.print(" ");
            }
            for(int j=5; j>=i; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/

/*public class Solution {
    public static void main(String args[]) {
        for(int i=1; i<=5; i++) {
            for(int x=1; x<i; x++) {
                System.out.print(" ");
            }
            for(int j=i; j<=5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/

/*public class Solution {
    public static void main(String args[]) {
        for(int i=5; i>=1; i--) {
            for(int x=5; x>i; x--) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/

//Functions:

//Write a Java method to compute the average of three numbers.

/*import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = sc.nextDouble();
        System.out.print("Input the second number: ");
        double y = sc.nextDouble();
        System.out.print("Input the third number: ");
        double z = sc.nextDouble();
        System.out.print("The average value is " + average(x, y, z) + "\n");
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}*/

//Write a method named isEven that accepts an int argument.The method should return true if the argument is even,
//or false otherwise.

/*import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter an integer: ");
        num = sc.nextInt();

        if(isEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}*/

//WAP to check if a number is a palindrome or not. (Ex: 121 is a palindrome)

/*import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }
    }
    public static boolean isPalindrome(int number) {
        int palindrome = number; //copied number intp variable
        int reverse = 0;

        while(palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;
    }
}*/

//Write a Java method to compute the sum of the digits in an integer.

/*import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }
    public static int sumDigits(int n) {
        int sumOfDigits = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;
        }
        return sumOfDigits;
    }
}*/









