package aaoop;

public class Test08 {
    public static void main(String[] args) {
        X x= new X();
        Y y= new Y();

        y.m2(); // m2, Y Class
        x.m1(); // m1, X Class
        y.m1(); // m1, Y Class
        x=y;
        x.m1(); // m1, Y Class
    }
}
