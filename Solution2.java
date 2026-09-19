//Strings:

//Count how many times lowercase vowels occured in a String entered by the user.

/*import java.util.*;

public class Solution2 {
    public static void main(String args[]) {
        String str = new Scanner(System.in).next();
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
                count++;
            }
        }
        System.out.println("count of vowels is : " + count);
    }
}*/

//Determine if 2 Strings are Anagrams of each other.

/*import java.util.Arrays;

public class Solution2 {
    public static void main(String args[]) {
        String str1 = "earth";
        String str2 = "heart";

        // Convert Strings to lowercase. Why? so that we don't have to check separately for lower & uppercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if the lengths are same
        if(str1.length() == str2.length()) {

            //convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // if the sorted char arrays are same or identical then the strings are anagram
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            // case when lengths are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
}*/

//Bit Manipulation:

//Swap two numbers without using any third variable.

/*public class Solution2 {
    public static void main(String args[]) {
        int x = 3, y = 4;
        System.out.println("Before swap: x = " + x + " and y = " + y);
        //swap using XOR
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + " and y = " + y);
    }
}*/

//Add 1 to an integer using Bit Manipulation. (use Bitwise NOT Operator)

/*public class Solution2 {
    public static void main(String args[]) {
        int x = 6;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = -4;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = 0;
        System.out.println(x + " + " + 1 + " is " + -~x);
    }
}*/

//Convert uppercase characters to lowercase using Bits.

/*public class Solution2 {
    public static void main(String args[]) {
        // Convert uppercase character to lowercase.
        for(char ch = 'A'; ch<= 'z'; ch++) {
            System.out.println((char)(ch | ' '));
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}*/

//OOPS:

//Print the sum, difference and product of two complex numbers with separate methods for each
//operation whose real and imaginary parts are entered by the user.

/*import java.util.*;

class Complex {
    int real;
    int imag;

    public Complex (int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real+b.real), (a.imag+b.imag));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real-b.real), (a.imag-b.imag));
    }

    public static Complex product(Complex a, Complex b) {
        return new  Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }

    public void printComplex() {
        if(real == 0 && imag != 0) {
            System.out.println(imag+"i");
        }
        else if(imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real+"+"+imag+"i");
        }
    }
}

class Solution2 {
    public static void main(String args[]) {
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);

        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}*/

//Recursion:

//Print all the occurances of a given element. (code:1001)

/*public class Solution2 {
    public static void allOccurences(int arr[], int key, int i) {
        if(i == arr.length) {
            return;
        }

        if(arr[i] == key) {
            System.out.print(i+" ");
        }
        allOccurences(arr, key, i+1);
    }

    public static void main(String args[]) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        allOccurences(arr, key, 0);
        System.out.println();
    }
}*/

//Convert a given number into a String of english. (code:1002)

/*public class Solution2 {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printDigits(int number) {
        if(number == 0) {
            return;
        }

        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }

    public static void main(String args[]) {
        printDigits(1234);
        System.out.println();
    }
}*/

//WAP to find Length of a String using Recursion. (code:1003)

/*public class Solution2 {
    public static int length(String str) {
        if(str.length() == 0) {
            return 0;
        }

        return length(str.substring(1)) + 1;
    }

    public static void main(String args[]) {
        String str = "abcde";
        System.out.println(length(str));
    }
}*/

//Count of all contiguous substrings starting and ending with the same character. (code:1004)

/*public class Solution2 {
    public static int countSubstrs(String str, int i, int j, int n) {
        if(n == 1) {
            return 1;
        }
        if(n <= 0) {
            return 0;
        }

        int res = countSubstrs(str, i+1, j, n-1) + countSubstrs(str, i, j-1, n-1) - countSubstrs(str, i+1, j-1, n-2);

        if(str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }
    public static void main(String args[]) {
        String str = "abcab";
        int n = str.length();
        System.out.print(countSubstrs(str, 0, n-1, n));
    }
}*/

//Tower of Hanoi: (code:1005) {TC: O(2^n)}

/*public class Solution2 {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        //base case
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        
        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
        //transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}*/

//Divide & Conquer:

//Apply Merge Sort to sort an array of Strings. (code:1006)

/*class Solution2 {
    //function to mergesort 2 arrays
    public static String[] mergeSort(String[] arr, int lo, int hi) {
        if(lo == hi) {
            String[] A = { arr[lo] };
            return A;
        }

        int mid = lo + (hi - lo) / 2;
        String[] arr1 = mergeSort(arr, lo, mid);
        String[] arr2 = mergeSort(arr, mid + 1, hi);

        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];

        int idx = 0;

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                arr3[idx] = arr1[i];
                i++;
                idx++;
            }
            else {
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }

        while (i < m) {
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }

        while (j < n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }

        return arr3;
    }

    //return true if str1 appears before str2 in alphabetical order
    static boolean isAlphabeticallySmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        String[] a = mergeSort(arr, 0, arr.length-1);
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}*/

//Given an array nums of size n, return the majorty element. (code:1007)

//Brute force Approach:-

/*class Solution2 {
    public static int majorityElement(int[] nums) {
        int majorityCount = nums.length/2;

        for (int i=0; i<nums.length; i++) {
            int count = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[j] == nums[i]) {
                    count += 1;
                }
            }
            if(count > majorityCount) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }
}*/

//Divide & Conquer Approach:-

/*class Solution2 {
    private static int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for(int i = lo; i <= hi; i++) {
            if(nums[i] == num) {
                count++;
            }
        }
        return count;
    }
    private static int majorityElementRec(int[] nums, int lo, int hi) {
        //base case: the only element in an array of size 1 is the majority element
        if (lo == hi) {
            return nums[lo];
        }

        //recurse on left & right halves of this slice
        int mid = (hi-lo)/2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid+1, hi);

        //if the two halves agree on the majority element, return it.
        if (left == right) {
            return left;
        }

        // otherwise, count each element and return the "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length-1);
    }

    public static void main(String args[]) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }
}*/

//Given an array of integers. Find the Inversion Count in the array.

//Brute Force Approach:- {TC: O(n^2)}

/*class Solution2 {
    public static int getInvCount(int arr[]) {
        int n = arr.length;
        int invCount = 0;

        for(int i=0; i<n-1; i++) {
            for(int j=i+1;j<n; j++) {
                if(arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    public static void main(String args[]) {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println("Inversion Count = "+ getInvCount(arr));
    }
}*/

//Modified Merge Sort Approach:- {TC: O(n logn)}

/*public class Solution2 {
    public static int merge(int arr[], int left, int mid, int right) {
        int i = left, j = mid, k =0;
        int invCount = 0;
        int temp[] = new int[(right - left + 1)];

        while ((i < mid) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                invCount += (mid - i);
                k++;
                j++;
            }
        }

        while (i < mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        for(i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
        return invCount;
    }

    private static int mergeSort(int arr[], int left, int right) {
        int invCount = 0;

        if(right > left) {
            int mid = (right + left) / 2;

            invCount = mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);
            invCount += merge(arr, left, mid + 1, right);
        }

        return invCount;
    }

    public static int getInversions(int arr[]) {
        int n = arr.length;
        return mergeSort(arr, 0, n-1);
    }

    public static void main(String args[]) {
        int arr[] = {1, 20, 6, 4, 8};
        System.out.println("Inversion Count = " + getInversions(arr));
    }
}*/
