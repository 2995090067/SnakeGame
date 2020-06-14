package test;

import overload.OverLoad;

import java.util.Scanner;

public class TestNew {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        OverLoad.out("输入一个姓名");
        String name=input.next();
        OverLoad.out(Over(name));
    }
        public static String Over(String name){
            String rember="我是"+name;
            return rember;
        }
        //判断100个数字中是否有重复的数字
}
