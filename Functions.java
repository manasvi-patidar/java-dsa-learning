//Syntax of Funtion:

/*public class Functions {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Manasvi here!");
        System.out.println("How are you?");
        return;
    }
    public static void main(String args[]) {
        printHelloWorld(); //function call
        printHelloWorld();
    }
}*/

//Print a given name in a function.

/*import java.util.*;

public class Functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);
    }
}*/

//Syntax of Function with Parameters:

//Make a function to add 2 numbers and return the sum.

/*import java.util.*;

public class Functions {
    public static int calculateSum(int a, int b) { //parameters or formal parameters
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b); //arguments or actual parameters
        System.out.println("Sum of 2 numbers is : " + sum);
    }
}*/

//Call by Value:

//Make a function to swap 2 numbers.

/*import java.util.*;

public class Functions {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
    public static void main(String args[]) {
        int a = 5;
        int b = 10;
        swap(a,b);
    }
}*/

//Make a function to multiply 2 numbers and return the product.

/*import java.util.*;

public class Functions {
    public static int calculateProduct(int a, int b) {
        return a * b;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product of 2 numbers is : "+ calculateProduct(a, b));
    }
}*/

//Find the factorial of a number n.

/*import java.util.*;

public class Functions {
    public static void printFactorial(int n) {
        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for(int i=1; i<=n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
}*/

//Find the Binomial Coefficient of a number.{formula: nCr = n! / r!(n-r)!}

/*import java.util.*;

public class Functions {
    public static int factorial(int n) {
        int f =1;

        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String args[]) {
        System.out.println(binCoeff(5,2));
    }
}*/

//Function Overloading using Parameters:

/*public class Functions {
    //function 1
    public static int sum(int a, int b) {
        return a+b;
    }

    //Function 2
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String args[]) {
        System.out.println(sum(5,2));
        System.out.println(sum(5,2,1));
    }
}*/

//Function Overloading using Data Types:

/*public class Functions {
    //Function 1
    public static int sum(int a, int b) {
        return a+b;
    }

    //Function 2
    public static float sum(float a, float b) {
        return a+b;
    }

    public static void main(String args[]) {
        System.out.println(sum(2,4));
        System.out.println(sum(3.2f,4.8f));
    }
}*/

//Check if a number is Prime or not.

/*public class Functions {
    public static boolean isPrime(int n) {
        //corner cases
        if(n == 2) {
            return true;
        }
        for(int i=2; i<=n-1; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println(isPrime(12));
    }
}*/

//Check if a number is Prime or not.(more Optimized way)

/*public class Functions {
    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println(isPrime(3));
    }
}*/

//Print all Primes in a Range.(n = 20)

/*public class Functions {
    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {  //true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        primesInRange(20); // 2 to 20
    }
}*/

//Binary to Decimal Conversion:

/*public class Functions {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
    
        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
    
            pow++;
            binNum = binNum/10;
        }
    
        System.out.println("decimal of " + myNum +" = "+ decNum);
    }
    
    public static void main(String args[]) {
        binToDec(101);
    }
}*/

//Decimal to Binary Conversion:

/*public class Functions {
    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n > 0) {
            int rem = n % 2; // remainder
            binNum = binNum + (rem * (int)Math.pow(10,pow));

            pow++;
            n = n/2;
        }
        System.out.println("binary form of " + myNum + " = " + binNum);
    }
    public static void main(String args[]) {
        decToBin(7);
    }
}*/
