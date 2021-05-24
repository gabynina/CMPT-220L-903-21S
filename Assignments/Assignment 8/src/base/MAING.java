package base;

public class Main {

<<<<<<< HEAD
    static int fibonaci_linear(int a, int b, int c){
        if (a == 0)
            return a;
        if (a == 1)
            return c;
        return fibonaci_linear(a-1, c, b+c);
    }

    static int fibonaci_tail(int a){
        if (a <= 1)
            return a;
        return fibonaci_tail(a-1)+fibonaci_tail(a-2);
    }

    static int fibonaci_head(int a){
        if (a>1){
            return fibonaci_head(a-1)+fibonaci_head(a-2);
        } else {
            return a;
        }
    }




    public static void main(String[] args) {
        int a = 9;
        System.out.println(fibonaci_linear(a, 0, 1));
        System.out.println(fibonaci_tail(a));
        System.out.println(fibonaci_head(a));
=======
    public static void main(String[] args) {
        System.out.println(fibTail(5));
        System.out.println(fibHead(5));
        System.out.println(fib(5));
    }

    public static Integer fib(Integer n) {
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
        return fib(n-2) + fib(n-1);
    }

    public static Integer fibHead(Integer n) {
        if (n >= 2) {
            return fibHead(n-2) + fibHead(n-1);
        }
        if (n == 1) {return 1;}
        return 0;
    }

    public static Integer fibTail(Integer n) {
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
        return fibTail(n-2) + fibTail(n-1);
>>>>>>> upstream/main
    }
}
