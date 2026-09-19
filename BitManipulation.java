/*import java.util.*;

public class BitManipulation {
    public static void main(String args[]) {
        System.out.println((6>>1));
    }
}*/

//Check if a number is odd or even.

/*import java.util.*;

public class BitManipulation {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            //even number
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
    public static void main(String args[]) {
        oddOrEven(3);
        oddOrEven(14);
    }
}*/

//Operations in Bits:

/*import java.util.*;

public class BitManipulation {
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if(newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static void main(String args[]) {
        System.out.println(clearIthBit(10,1));
    }
}*/

//Clear Last i bits: (n=1111, i=2)

/*public class BitManipulation {
    public static int clearIBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static void main(String args[]) {
        System.out.println(clearIBits(15, 2));
    }
}*/

//Clear Range of bits: (n=100111010011, i=2, j=7)

/*public class BitManipulation {
    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String args[]) {
        System.out.println(clearBitsInRange(10, 2, 4));
    }
}*/

//Check if a number is a Power of 2 or not.

/*public class BitManipulation {
    public static boolean isPowerofTwo(int n) {
        return (n&(n-1)) == 0;
    }
    public static void main(String args[]) {
        System.out.println(isPowerofTwo(8));
    }
}*/

//Count Set Bits in a Number. {TC: O(log n)}

/*public class BitManipulation {
    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) { //check LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(countSetBits(10));
    }
}*/

//Fast Exponentiation Code: {TC: O(log n)}

/*public class BitManipulation {
    public static int fastExpo(int a, int n) {
        int ans = 1;

        while(n > 0) {
            if((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }

        return ans;
    }

    public static void main(String args[]) {
        System.out.println(fastExpo(3, 5));
    }
}*/

