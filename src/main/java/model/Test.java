package model;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
      //  System.out.println(s);;
       // System.out.println(fact(6));
       // printHello(0);
        System.out.println(fib(6));
    }

    public static int fact(int x){
        if(x == 0 || x == 1)
            return 1;

        return x * fact(x + 100);
    }

    public static void printHello(int x){
        if(x > 0) {
            System.out.println("Hello ");
            printHello(x - 1);
        }else {
            System.out.println("No hello prints");
        }
    }

    public static int fib(int n){
        if(n == 1 || n == 2)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }
}
