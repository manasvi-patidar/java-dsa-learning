//Operations in HashMap:

/*import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);

        System.out.println(hm);

        //Size - O(1)
        System.out.println(hm.size());

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia")); //invalid key

        //ContainsKey - O(1)
        System.out.println(hm.containsKey("India")); //true
        System.out.println(hm.containsKey("Indonesia")); //false

        //Remove - O(1) 
        System.out.println(hm.remove("China"));
        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm);

        //Is Empty
        hm.clear(); //this function removes all the elements from Map
        System.out.println(hm.isEmpty());
    }
}*/

//Iteration on HashMap:

/*import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) { //'foreach' loop for iteration on array
            System.out.println("key = " + k + ", value = " + hm.get(k));
        }
    }
}*/

//HashMap Implementation Code:

/*import java.util.*;
import java.util.LinkedList;
import java.util.HashMap;

public class Hashing {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public  Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n
        private int N;
        private LinkedList<Node> buckets[]; //N

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for(int i=0; i<ll.size(); i++) {
                Node node = ll.get(i);
                if(node.key == key) {
                    return di;
                }
                di++;
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for(int i=0; i<buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            //nodes -> add in bucket
            for(int i=0; i<oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0; j<ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) { //O(lambda) -> O(1)
            int bi = hashFunction(key); 
            int di = SearchInLL(key, bi);

            if(di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1) { //valid
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) { //O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) { //O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n== 0;
        }
    }
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys) {
            System.out.println(key);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}*/

//Linked HashMap:

/*import java.util.*;
import java.util.LinkedHashMap;

public class Hashing {
    public static void main(String args[]) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        System.out.println(lhm);
    }
}*/

//TreeMap:

/*import java.util.*;
import java.util.TreeMap;

public class Hashing {
    public static void main(String args[]) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);

        System.out.println(tm);
    }
}*/

//Majority Element:

/*import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet) {
            if(map.get(key) > arr.length/3) {
                System.out.println(key);
            }
        }
    }
}*/

//Another short way to write the above same code:

/*import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length/3) {
                System.out.println(key);
            }
        }
    }
}*/

//Valid Anagram:

/*import java.util.*;

public class Hashing {
    public static boolean isAnagram(String s, String t) { //O(n)
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            if(map.get(ch) != null) { //key exists
                if(map.get(ch) == 1) { //frequency = 1
                    map.remove(ch);
                } else { //frequency > 1
                    map.put(ch, map.get(ch) -1);
                }
            } else {
                return false; //means 't' has a ch which doesn't exist in 's'
            }
        }

        return map.isEmpty();
    }

    public static void main(String args[]) {
        String s = "race";
        String t = "care";

        System.out.println(isAnagram(s, t));
    }
}*/

//HashSet Operations:

/*import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2); //duplicates cannot be stored
        set.add(1);

        System.out.println(set);

        if(set.contains(2)) {
            System.out.println("set contains 2");
        }
        
        set.remove(1);
        System.out.println(set);

        System.out.println(set.size());

        set.clear();
        System.out.println(set.size());

        System.out.println(set.isEmpty());
    }
}*/

//Iteration on HashSets:

//using Iterators:
/*import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        Iterator it = cities.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}*/

//using Advanced loop:
/*import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        for(String city : cities) {
            System.out.println(city);
        }
    }
}*/

//Linked HashSet:

/*import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);

        lhs.remove("Delhi");
        System.out.println(lhs);

    }
}*/

//TreeSet:

/*import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts);
    }
}*/

//Count Distint Elements: //O(n)

/*import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        int num[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<num.length; i++) {
            set.add(num[i]);
        }

        System.out.println("ans = " + set.size());
    }
}*/

//Union & Intersection of 2 arrays:

/*import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> set = new HashSet<>();

        //union
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("union = " + set.size());

        //intersection
        set.clear();

        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        int count = 0;
        for(int i=0; i<arr2.length; i++) {
            if(set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }

        System.out.println("intersection = " + count);
    }
}*/

//Find Itinerary from Tickets:

/*import java.util.*;

public class Hashing {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for(String key : tickets.keySet()) {
            if(!revMap.containsKey(key)) {
                return key; //starting point
            }
        }

        return null;
    }
    public static void main(String args[]) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }

        System.out.println();
    }
}*/

//Largest subarray with 0 sum:

/*import java.util.*;

public class Hashing {
    public static void main(String args[]) { //O(n)
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        HashMap<Integer, Integer> map = new HashMap<>();
        //(sum, idx)

        int sum = 0;
        int len = 0;

        for(int j=0; j<arr.length; j++) {
            sum += arr[j];
            if(map.containsKey(sum)) {
                len = Math.max(len, j-map.get(sum)); //j-i
            } else {
                map.put(sum, j);
            }
        }

        System.out.println("largest subarray with sum as 0 => " + len);
    }
}*/

//Subarray sum equal to K.

/*import java.util.*;

public class Hashing {
    public static void main(String args[]) { //O(n)
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        //(sum, count)
        map.put(0, 1);

        int sum = 0;
        int ans = 0;

        for(int j=0; j<arr.length; j++) {
            sum += arr[j]; //sum(j)
            if(map.containsKey(sum-k)) {
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("count of subarrays = " + ans);
    }
}*/




