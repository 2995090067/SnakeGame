package exception;


import overload.Lambda;
import overload.OverLoad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyException extends Exception {
    static  class LambdaTest{
        Lambda a=new Lambda() {
            @Override
            public String out() {
                return "张三";
            }
        };
        Lambda b=()-> "lisi";
    }
    String message;
    public MyException(String ErrorMessage){
        message= ErrorMessage;
    }
    public String getMesage(){
        return message;
    }
    static {
        System.out.println("类加载");
    }
    public static void main(String i){
        System.out.println("我是i"+i);
    }
    public static void main(String[] args) {
        String animal="动物";
        main(animal);

//        String aTest=

//        System.out.println(LambdaTest.a);
//        (String a,"lll")-> OverLoad.out(a);
//        int a=77;
//        (int a)->OverLoad.out(a);
//        (int x,int y)->x+y;
//        Class<Lambda> a= Lambda.class;
        String [] a={"张三","李四","网二1","码子","工会"};
        List<String> ass= Arrays.asList(a);
        ass.forEach((sl)->OverLoad.out(ass+"!"));
        int x=5;
        int y=5;
        int z=0;
//        (x,y) -> x + y;
//        ((6,6) -> z = x + y);
        for(String s1:ass){
            System.out.println(s1+"44");
        }
        String bb=a[0];
        String cc=a[3];
//        System.out::println;
//    \((bb,cc)-> bb+cc));
    }
}
