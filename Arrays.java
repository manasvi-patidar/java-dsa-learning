//Store the marks of three subjects of a Student.

/*import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        int marks[] = new int[10];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");
    }
}*/

//Passing array as Arguments:(Call by reference)

/*import java.util.*;

public class Arrays {
    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int marks[] = {97, 98, 99};
        update(marks);

        //print marks
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}*/

//Linear Search: {Time complexity: O(n)}

/*import java.util.*;

public class Arrays {
    public static int linearSearch(int numbers[], int key) {

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("Key is at index : "+ index);
        }
    }
}*/

//Largest & Smallest Number in Array: {Time Complexity: O(n)}

/*import java.util.*;

public class Arrays {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);

        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("Largest value is : " + getLargest(numbers));
    }
}*/

//Binary Search: {Time Complexity: O(log n)}

/*import java.util.*;

public class Arrays {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            //comparisons
            if(numbers[mid] == key) { //found
                return mid;
            }
            if(numbers[mid] < key) { //right
                start = mid+1;
            } else { //left
                end = mid-1;
            }
        }

        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("index for key is : " + binarySearch(numbers,key));
    }
}*/

//Reverse an Array: {SC: O(1) & TC: O(n)}

/*import java.util.*;

public class Arrays {
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length-1;

        while(first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};

        reverse(numbers);
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}*/

//Pairs in an Array: {TC: O(n^2)}

/*import java.util.*;

public class Arrays {
    public static void printPairs(int numbers[]) {
        int tp = 0;
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + tp);
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}*/

//Print Subarrays:

/*import java.util.*;

public class Arrays {
    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) { //print
                    System.out.print(numbers[k]+" "); //subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays = " + ts);
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}*/


