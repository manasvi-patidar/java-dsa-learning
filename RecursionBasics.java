//Print numbers from n to 1 (Decreasing Order).

/*public class RecursionBasics {
    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String args[]) {
        int n = 10;
        printDec(n);
    }
}*/

//Print numbers from 1 to n (Increasing Order)

/*public class RecursionBasics {
    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]) {
        int n = 10;
        printInc(n);
    }
}*/

//Print factorial of a number n. {TC: O(n), SC: O(n)}

/*public class RecursionBasics {
    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(fact(n));
    }
}*/

//Print sum of first n natural numbers. {TC: O(n), SC: O(n)}

/*public class RecursionBasics {
    public static int calcSum(int n) {
        if(n == 1) {
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(calcSum(n));
    }
}*/

//Print nth Fibonacci Number. {TC: O(2^n), SC: O(n)}

/*public class RecursionBasics {
    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String args[]) {
        int n = 4;
        System.out.println(fib(n));
    }
}*/

//Check if a given array is sorted or not. {TC: O(n), SC: O(n)}

/*public class RecursionBasics {
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 5, 4};
        System.out.println(isSorted(arr, 0));
    }
}*/

//WAF to find the first occurance of an element in an array. {TC: O(n), SC: O(n)}

/*public class RecursionBasics {
    public static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }
    public static void main(String args[]) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstOccurence(arr, 5, 0));
    }
}*/

//WAF to find the last occurence of an element in an array.

/*public class RecursionBasics {
    public static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }
    public static void main(String args[]) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccurence(arr, 5, 0));
    }
}*/

//Print x to the power n.{TC: O(n)}

/*public class RecursionBasics {
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }

        return x * power(x, n-1);
    }
    public static void main(String args[]) {
        System.out.println(power(2,10));
    }
}*/

//Print x to the power n.(Optimized Approach) {TC: O(log n)}

/*public class RecursionBasics {
    public static int optimizedPower(int a, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String args[]) {
        int a = 2;
        int n = 10;

        System.out.println(optimizedPower(a, n));
    }
}*/





