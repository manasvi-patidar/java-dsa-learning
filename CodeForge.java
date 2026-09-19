//Recursion:

//Print x^n (Stack height = logn)

/*public class CodeForge {
    public static int calcPower(int x, int n) {
        if(n == 0) { //base case 1
            return 1;
        }
        if(x == 0) { //base case 2
            return 0;
        }

        //if n is even
        if(n % 2 == 0) {
            return calcPower(x, n/2) * calcPower(x, n/2);
        }
        else { //n is odd
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }
    public static void main(String args[]) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}*/

//Friends Pairing Problem:

/*public class CodeForge {
    public static int friendsPairing(int n) {
        if(n == 1 || n == 2) {
            return n;
        }

        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totWays
        int totWays = fnm1 + pairWays;
        return totWays;
    }
    public static void main(String args[]) {
        System.out.println(friendsPairing(3));
    }
}*/

//Binary Strings Problem:

/*public class CodeForge {
    public static void printBinStrings(int n, int lastPlace, String str) {
        //base case
        if(n == 0) {
            System.out.println(str);
            return;
        }

        //kaam
        if(lastPlace == 0) {
            //place 0 on chair n
            printBinStrings(n-1, 0, str+"0");
            printBinStrings(n-1, 1, str+"1");
        } else {
            printBinStrings(n-1, 0, str+"0");
        }
    }
    public static void main(String args[]) {
        printBinStrings(3, 0, "");
    }
}*/

//N-Queens(n=2):

/*public class CodeForge {
    public static void nQueens(char board[][], int row) {
        //base case
        if(row == board.length) {
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++) {
            board[row][j] ='Q';
            nQueens(board, row+1); //function call
            board[row][j] = 'x'; //backtracking step
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("--- Chess Board ---");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n=2;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
    }
}*/

