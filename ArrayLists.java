//Operations in ArrayList:

/*import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //Add Element: O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //Get Element: O(1)
        int element = list.get(2);
        System.out.println(element);

        //Remove Element: O(n)
        list.remove(3);
        System.out.println(list);


        //Set Element: O(n)
        list.set(2, 10);
        System.out.println(list);

        //Contains Element: O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //Add Element at index: O(n)
        list.add(1, 9);
        System.out.println(list);
    }
}*/

//Operations in ArrayList:

/*import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        //Size
        System.out.println(list.size());

        //Print ArrayList
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}*/

//Print Reverse of an ArrayList.

/*import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //Reverse Print {O(n)}
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}*/

//Find Maximum in an ArrayList.

/*import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        //print Maximum {O(n)}
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++) {
            //if(max < list.get(i)) {
            //    max = list.get(i);
            //}
            
            max = Math.max(max, list.get(i));
        }

        System.out.println("max element = " + max);
    }
}*/

//Swap 2 Numbers.

/*import java.util.ArrayList;

public class ArrayLists {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
    }
}*/

//Sorting an ArrayList.

/*import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static  void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list); //ascending
        System.out.println(list);

        //descending
        Collections.sort(list, Collections.reverseOrder()); //comparator
        System.out.println(list);
    }
}*/

//Multi-Dimensional ArrayList:

/*import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);

        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }

        System.out.println(mainList);
    }
}*/

/*import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            list1.add(i*1);  //1 2 3 4 5
            list2.add(i*2);  //2 4 6 8 10
            list3.add(i*3);  //3 6 9 12 15
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        //nested loops
        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}*/

//Container with Most Water:(Brute Force)

/*import java.util.ArrayList;

public class ArrayLists {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        //Brute Force - O(n^2)
        for(int i=0; i<height.size(); i++) {
            for(int j=i+1; j<height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j)); //(L1, L2)
                int width = j-i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }

        return maxWater;
    }
    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        //1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}*/

//Container with Most Water:(2 Pointer Approach)

/*import java.util.ArrayList;

public class ArrayLists {
    public static int storeWater(ArrayList<Integer> height) {
        //2 Pointer Approach - O(n)
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp) {

            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp)); //L1-L2
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            //update ptr
            if(height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }
    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}*/

//Find if any pair in a Sorted ArrayList has a target sum.(Brute Force Approach)

/*import java.util.ArrayList;

public class ArrayLists {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        //1, 2, 3, 4, 5, 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairSum1(list, target));
    }
}*/

//Find if any pair in a Sorted ArrayList has a target sum.(2 Pointer Approach)

/*import java.util.ArrayList;

public class ArrayLists {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp) {
            //case 1
            if(list.get(lp)+list.get(rp) == target) {
                return true;
            }

            //case 2
            if(list.get(lp)+list.get(rp) < target) {
                lp++;
            } else {
                //case 3
                rp--;
            }
        }

        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        //1, 2, 3, 4, 5, 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;

        System.out.println(pairSum1(list, target));
    }
}*/

//Find if any pair in a Sorted & Rotated ArrayList has a target sum.(2 Pointer Approach) {O(n)}

/*import java.util.ArrayList;

public class ArrayLists {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)) { //breaking point
                bp = i;
                break;
            }
        }

        int lp = bp+1; //smallest 
        int rp = bp; //largest

        while(lp != rp) {
            //case 1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }

            //case 2
            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n;
            } else {
                //case 3
                rp = (n+rp-1) % n;
            }
        }

        return false; //target sum doesn't exist
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        //11, 15, 6, 8, 9, 10 - Sorted & Rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list, target));

    }
}*/









