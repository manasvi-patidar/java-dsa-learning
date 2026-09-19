//Linked List:

//Insertion of Two LL:

/*class Solution4 {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node getIntersectionNode(Node head1, Node head2)
    {
        while(head2 != null) {
            Node temp = head1;
            while(temp != null) {
                if(temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String args[]) {
        Solution4 list = new Solution4();

        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        Node intersectionPoint = list.getIntersectionNode(head1, head2);
        if(intersectionPoint == null) {
            System.out.print("No Intersection Point\n");
        } else {
            System.out.print("Intersection Point: " + intersectionPoint.data);
        }
    }
}*/

//Delete N Nodes after M Nodes of a LL:

/*import java.util.*;

class Solution4 {
    static class Node {
        int data;
        Node next;
    };

    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    static void printList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.printf("%d", temp.data);
            temp = temp.next;
        }
        System.out.print("\n");
    }

    static void skipMdeleteN(Node head, int M, int N) {
        Node curr = head, t;
        int count;

        while(curr != null) {
            for(count =1; count < M && curr != null; count++)
            curr = curr.next;

            if(curr == null)
            return;
            t = curr.next;
            for(count = 1; count <= N && t != null; count++) {
                Node temp = t;
                t = t.next;
            }

            curr.next = t;
            curr = t;
        }
    }

    public static void main(String args[]) {
        Node head = null;
        int M=2,N=3;
        head=push(head, 10);
        head=push(head, 9);
        head=push(head, 8);
        head=push(head, 7);
        head=push(head, 6);
        head=push(head, 5);
        head=push(head, 4);
        head=push(head, 3);
        head=push(head, 2);
        head=push(head, 1);

        System.out.printf("M = %d,N = %d\n" + "Linked list we have is : \n",M, N);

        printList(head);

        skipMdeleteN(head, M, N);

        System.out.printf("\nLinked list on deletion is : \n");

        printList(head);
    }
}*/

//Swapping Nodes in a LL:

/*class Solution4 {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void swapNodes(int x, int y) {
        if(x == y) 
            return;

        Node prevX = null, currX = head;
        while(currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }   

        Node prevY = null, currY = head;
        while(currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if(currX == null || currY == null)
            return;

        if(prevX != null)
            prevX.next = currY;
        else 
            head = currY;
            
        if(prevY != null)
            prevY.next = currX;
        else
            head = currX;   
            
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;    
    }

    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    public void printList() {
        Node tNode = head;
        while(tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String args[]) {
        Solution4 list = new Solution4();

        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.print("\n Linked list before: ");
        list.printList();
        list.swapNodes(4, 3);
        System.out.print("\n Linked list after: ");
        list.printList();
    }
}*/

//Odd Even Linked List:

/*class Solution4 {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void segregateEvenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;

        while(end.next != null)
        end = end.next;

        Node new_end = end;

        while(curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }

        if(curr.data % 2 == 0) {
            head = curr;
            while(curr != end) {
                if(curr.data%2 == 0) {
                    prev = curr;
                    curr = curr.next;
                }
                else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        }
        else prev = curr;
        if(new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Solution4 list = new Solution4();
        list.push(11);
        list.push(10);
        list.push(8);
        list.push(6);
        list.push(4);
        list.push(2);
        list.push(0);
        System.out.println("Linked List");
        list.printList();

        list.segregateEvenOdd();

        System.out.println("Updated Linked List");
        list.printList();
    }
}*/

//Merge K Sorted Lists:

/*public class Solution4 {
    public static Node SortedMerge(Node a, Node b) {
        Node result = null;
        if(a == null)
            return b;
        else if(b == null)   
            return a;
        if(a.data <= b.data) {
            result = a;
            result.next = SortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = SortedMerge(a, b.next);
        }
        
        return result;
    }

    public static Node mergeKLists(Node arr[], int last)
    {
        while(last != 0) {
            int i = 0, j = last;
            while (i < j) {
                arr[i] = SortedMerge(arr[i], arr[j]);
                i++;
                j--;
                if(i >= j)
                   last = j;
            }
        }
        return arr[0];
    }

    public static void printList(Node node) {
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String args[]) {
        int k = 3;
        int n = 4;
        Node arr[] = new Node[k];

        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        Node head = mergeKLists(arr, k-1);
        printList(head);
    }
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}*/

//Stacks:

//Palindrome Linked List:

/*import java.util.*;

class Solution4 {
    public static void main(String args[]) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;
        five.ptr = six;
        six.ptr = seven;
        boolean condition = isPalindrome(one);
    }
    static boolean isPalindrome(Node head) {
        Node slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();

        while(slow != null) {
            stack.push(slow.data);
            slow = slow.ptr;
        }

        while(head != null) {
            int i = stack.pop();
            if(head.data == i) {
                ispalin = true;
            } else {
                ispalin = false;
                break;
            }
            head = head.ptr;
        }
        return ispalin;
    }
}

class Node {
    int data;
    Node ptr;
    Node(int d) {
        ptr = null;
        data = d;
    }
}*/

//Simplify Path:

/*import java.io.*;
import java.util.*;

class Solution4 {
    public static void main(String args[]) {
        String str = new String("/a/ ./b/ ../../c/");
        String res = simplify(str);
        System.out.println(res);
    }

    static String simplify(String A) {
        Stack<String> st = new Stack<String>();
        String res = "";
        res += "/";
        int len_A = A.length();

        for(int i=0; i < len_A; i++) {
            String dir = "";
            while(i < len_A && A.charAt(i) == '/')
            i++;

            while(i < len_A && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }

            if(dir.equals("..") == true) {
                if(!st.empty())
                   st.pop();
            }

            else if(dir.equals(".") == true)
                   continue;

            else if(dir.length() != 0)     
                   st.push(dir);
        }

        Stack<String> st1 = new Stack<String>();
        while(!st.empty()) {
            st1.push(st.pop());
        }

        while(!st1.empty()) {
            if (st1.size() != 1)
               res += (st1.pop() + "/");
            else
               res += st1.pop();
        }
        return res;
    }
}*/

//Decode a String:

/*import java.util.Stack;

class Solution4 {
    static String decode(String str) {
        Stack<Integer> integerstack = new Stack<>();
        Stack<Character> stringstack = new Stack<>();
        String temp = "", result = "";
        for(int i = 0; i < str.length(); i++) {
            int count = 0;
            if(Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }

                i--;
                integerstack.push(count);
            }

            else if (str.charAt(i) == ']') {
                temp = "";
                count = 0;

                if(!integerstack.isEmpty()) {
                    count = integerstack.peek();
                    integerstack.pop();
                }

                while(!stringstack.isEmpty() && stringstack.peek() != '[') {
                    temp = stringstack.peek() + temp;
                    stringstack.pop();
                }

                if(!stringstack.empty() && stringstack.peek() == '[')
                    stringstack.pop();

                for(int j = 0; j < count; j++) 
                    result = result + temp;
                    
                for(int j = 0; j < result.length(); j++)    
                    stringstack.push(result.charAt(j));

                result = ""; 
            }

            else if(str.charAt(i) == '[') {
                if(Character.isDigit(str.charAt(i-1)))
                    stringstack.push(str.charAt(i));

                else {
                    stringstack.push(str.charAt(i));
                    integerstack.push(1);
                }    
            }
            else
                    stringstack.push(str.charAt(i));
        }

        while (!stringstack.isEmpty()) {
            result = stringstack.peek() + result;
            stringstack.pop();
        }
        return result;
    }

    public static void main(String args[]) {
        String str = "3[b2[ca]]";
        System.out.println(decode(str));
    }
}*/

//Trapping Rainwater(using Stacks):

/*import java.io.*;
import java.util.*;

class Solution4 {
    public static int maxWater(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            while((!stack.isEmpty())
                  && (height[stack.peek()] < height[i])) {
                  int pop_height = height[stack.peek()];
                  stack.pop();
                  if(stack.isEmpty())
                         break;
                  int distance = i - stack.peek() - 1;
                  int min_height = Math.min(height[stack.peek()],
                                   height[i]) - pop_height;       

                  ans += distance*min_height;                 
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        System.out.println(maxWater(arr));
    }
}*/

//Queues:

//Generate Binary Numbers:

/*import java.util.LinkedList;
import java.util.Queue;

public class Solution4 {
    static void generatePrintBinary(int n) {
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while(n --> 0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }
    public static void main(String args[]) {
        int n = 10;
        generatePrintBinary(n);
    }
}*/

//Connect n ropes with minimum cost:

/*import java.util.*;

class Solution4 {
    static int minCost(int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }

        int res = 0;
        while(pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res += first + second;
            pq.add(first + second);
        }
        return res;
    }

    public static void main(String args[]) {
        int len[] = {4, 3, 2, 6};
        int size = len.length;
        System.out.println("Total cost for connecting ropes is " + minCost(len, size));
    }
}*/

//Maximum of all subArrays of size k:

/*import java.util.Deque;
import java.util.LinkedList;

public class Solution4 {
    static void printMax(int arr[], int n, int k) {
        Deque<Integer> Qi = new LinkedList<Integer>();
        int i;
        for(i=0; i<k; ++i) {
            while(!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
               Qi.removeLast();
               Qi.addLast(i);
        }
        for(; i<n; ++i) {
            System.out.print(arr[Qi.peek()] + " ");
            while((!Qi.isEmpty()) && Qi.peek() <= i -k)
               Qi.removeFirst();
            while((!Qi.isEmpty()) && arr[i] >= arr[ Qi.peekLast()]) 
               Qi.removeLast();
               Qi.addLast(i);  
        }
        System.out.print(arr[Qi.peek()]);
    }
    public static void main(String args[]) {
        int arr[] = {12, 1, 78, 90, 57, 89, 56};
        int k = 3;
        printMax(arr, arr.length, k);
    }
}*/