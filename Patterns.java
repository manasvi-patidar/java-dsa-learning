//Half Pyramid Pattern:

/*public class Patterns {
    public static void main(String args[]) {
        for(int line=1; line<=4; line++) {
            //one line
            for(int star=1; star<=line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//Inverted Half Pyramid Pattern:

/*public class Patterns {
    public static void main(String args[]) {
        int n = 4;
        for(int line=1; line<=n; line++) {
            for(int star=1; star<=n-line+1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//Half Pyramid Pattern with numbers:

/*public class Patterns {
    public static void main(String args[]) {
        int n = 4;

        for(int line=1; line<=n; line++) {
            //print numbers
            for(int number=1; number<=line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}*/

//Character Pattern:

/*public class Patterns {
    public static void main(String args[]) {
        int n = 4;
        char ch = 'A';

        for(int line=1; line<=n; line++) {
            for(int chars=1; chars<=line; chars++) { 
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}*/

//Number Pyramid Pattern:

/*public class Patterns {
    public static void main(String args[]) {
        int n = 5;

        for(int i=1; i<=n; i++) {

            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //numbers
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}*/

//Palindromic Pattern:

/*public class Patterns {
    public static void main(String args[]) {
        int n = 5;

        for(int i=1; i<=n; i++) {

            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //1st half numbers
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            //2nd half numbers
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

