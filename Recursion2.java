//Tiling Problem:

/*public class Recursion2 {
    public static int tilingProblem(int n) {  // 2 x n (floor size)
        //base case
        if(n == 0 || n == 1) {
            return 1;
        }

        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice 
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void main(String args[]) {
        System.out.println(tilingProblem(3));
    }
}*/

//Remove Duplicates in a String.

/*public class Recursion2 {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}*/

//Friends Pairing Problem:

/*public class Recursion2 {
    public static int friendsPairing(int n) {
        if(n == 1 || n == 2) {
            return n;
        }

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String args[]) {
        System.out.println(friendsPairing(3));
    }
}*/

//Binary Strings Problem:

/*public class Recursion2 {
    public static void printBinStrings(int n, int lastPlace, String str) {
        //base case
        if(n == 0) {
            System.out.println(str);
            return;
        }

        //kaam
        printBinStrings(n-1, 0, str+"0");

        if(lastPlace == 0) {
            printBinStrings(n-1, 1, str+"1");
        }
    }

    public static void main(String args[]) {
        printBinStrings(3, 0, "");
    }
}*/