package test;

import javafx.concurrent.Task;
import overload.Lambda;
import overload.OverLoad;

import javax.xml.crypto.Data;

/**
 * 逆波兰表达式求值
 */

public class FibonacciSequence {
    //Fibonacci sequence菲波那切数列
    /**
     * 0 1 2 3 4 5
     * 0 1 1 2 3 5 8 13 21.. 第三个数等于前两个数之和
     */
    //递归解决
    //效率低
    public static  int fibi(int n){
        if(n<=1){
            return n;
        }
        return fibi(n-1)+fibi(n-2);
    }
    public static int fibi2(int n){
        if (n<=1){
            return n;
        }
        int first=0;
        int second=1;
        for (int i=0;i<n-1;i++){
            int sum=first+second;
            first=second;
            second=sum;
        }
        return second;
    }

    public static void main(String[] args) {
        int n=44;
//        OverLoad.out(fibi(3));
//        OverLoad.out(fibi2(3));
//        TimeTest.test("fibi",new Task){
////            public void execute(){
////                OverLoad.out(fibi(n));
////            }
//        Lambda表达式写法
        TimeTest.test("fib1",()->OverLoad.out(fibi(n)));
//        TimeTest.test("fib2", new TimeTest.Task() {
//            @Override
//            public void execute() {
//                OverLoad.out(fibi2(n));
//            }
//        });
        TimeTest.test("fib2", ()->OverLoad.out(fibi2(n)));

    }
}
