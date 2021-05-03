package base;

public class Main {

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
        System.out.println("fib("+ a + ") = "+ fibonaci_linear(a, 0, 1));
        System.out.println(fibonaci_tail(a));
        System.out.println(fibonaci_head(a));
    }
}
