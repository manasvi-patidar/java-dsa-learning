//Write a string which takes their name as input from the user.

/*import java.util.*;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); //for single word we use next() but for line we use nextLine()
        System.out.println("Your name is : " + name);
    }
}*/

//Different functions 

/*import java.util.*;

public class Strings {
    public static void main(String args[]) {
        //concatenation
        String firstName = "Manasvi";
        String lastName = "Patidar";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //String Length
        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println();

        System.out.println(fullName.charAt(2));

        //compare
        if(firstName.compareTo(lastName) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        //substring
        String sentence = "My name is Manasvi";
        String name = sentence.substring(3, 11);
        System.out.println(name);
    }
}*/

//Check if a String is a Palindrome.

/*public class Strings {
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)) {
                //not a palindrome
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}*/

//Given a route containing 4 directions(E, W, N, S), find the shortest path to reach destination. {TC: O(n)}

/*public class Strings {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;

        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);

            //South
            if(dir == 'S') {
                y--;
            }
            //North
            else if(dir == 'N') {
                y++;
            }
            //West
            else if(dir == 'W') {
                x--;
            }
            //East
            else {
                x++;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.print(getShortestPath(path));
    }
}*/

//For a given set of Strings, print the largest string.(apple, mango, banana)

/*public class Strings {
    public static void main(String args[]) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}*/

//String Builder: {TC: O(26) for this code}

/*public class Strings {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}*/

//For a given String, convert each of the first letter of each word to uppercase.{TC: O(n)}

/*public class Strings {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String args[]) {
        String str = "hi, i am manasvi";
        System.out.println(toUpperCase(str));
    }
}*/

//String Compression: {TC: O(n)}

/*public class Strings {
    public static String compress(String str) {
        String newStr = "";

        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1) {
                newStr += count.toString();
            }
        }

        return newStr;
    }
    public static void main(String args[]) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}*/

//Reverse the string.

/*import java.util.*;

public class Strings {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}*/
