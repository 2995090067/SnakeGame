package test;

import number.NumberSX;
import out.Out;
import overload.OverLoad;

public class TestNumber {
    public static void main(String[] args) {
        double number=NumberSX.Subtraction(2,3);
        OverLoad.out(number);
        System.out.println(number);
        Out.out("他的值是"+number);
        Out.out("他的值是："+2+3);
        Out.out("他的值是："+(2+3));
    }
}
