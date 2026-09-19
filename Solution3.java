//Backtracking:

//Rat in a Maze:

/*public class Solution3 {
    public static void printSolution(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int x, int y) {
        // if(x, y outside maze) return false
        return (x >= 0 && x < maze.length
                && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    public static boolean solveMaze(int maze[][]) {
        int N = maze.length;
        int sol[][] = new int[N][N];
        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }
        printSolution(sol);
        return true;
    }

    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is valid
        if (isSafe(maze, x, y) == true) {
            if (sol[x][y] == 1)
                return false;
            sol[x][y] = 1;
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void main(String args[]) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        solveMaze(maze);

    }
}*/

//Keypad's Combination:

//Knight's Tour:

//ArrayList:

//Monotonic ArrayList:

/*import java.util.ArrayList;

public class Solution3 {
    public static boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<A.size()-1; i++) {
            if(A.get(i) > A.get(i+1))
               inc = false;
            if(A.get(i) < A.get(i+1))  
               dec = false; 
        }

        return inc || dec;
    }
    public static void main(String args[]) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(3);
        System.out.println(isMonotonic(A));
    }
}*/

//Lonely Numbers in ArrayList:

/*import java.util.ArrayList;

public class Solution3 {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i < nums.size()-1; i++) {
            if(nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1)) {
                list.add(nums.get(i));
            }
        }
        if(nums.size() == 1) {
            list.add(nums.get(0));
        }
        if(nums.size() > 1) {
            if(nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if(nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)) {
                list.add(nums.get(nums.size()-1));
            }
        }
        return list;
    }
    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        System.out.println(findLonely(nums));
    }
}*/

//Most Frequent Number following Key.

/*import java.util.ArrayList;

public class Solution3 {
    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int[] result = new int[1000];

        for(int i=0; i<nums.size()-1; i++) {
            if(nums.get(i) == key) {
                result[nums.get(i+1)-1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<1000; i++) {
            if(result[i] > max) {
                max = result[i];
                ans = i+1;
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        int key = 1;

        System.out.println(mostFrequent(nums, key));
    }
}*/

//Beautiful Arraylist:

//Approach 1: Iterative

/*import java.util.ArrayList;

public class Solution3 {
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for(int i=2; i<=n; i++) {
            ArrayList<Integer>temp= new ArrayList<>();
            for(Integer e:ans) {
                if(2*e<=n)temp.add(e*2);
            }
            for(Integer e:ans) {
                if(2*e-1<=n)temp.add(e*2-1);
            }

            ans = temp;
        }

        return ans;
    }
    public static void main(String args[]) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(4);
        System.out.println(beautifulArray(n));
    }
}*/

//Approach 2: Divide & Conquer

/*import java.util.ArrayList;

public class Solution3 {
    public ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideConquer(1, 1, res, n);
        return res;
    }
    private void divideConquer(int start, int increment, ArrayList<Integer> res, int n) {
        if (start + increment > n) {
            res.add(start);
            return;
        }
        divideConquer(start, 2 * increment, res, n);
        divideConquer(start + increment, 2 * increment, res, n);
    }
    public static void main(String args[]) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(4);
        System.out.println(beautifulArray(n));
    }
}*/

