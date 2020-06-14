package exception;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Verable {
    public static void main(String[] errors) {
        System.out.println("傻逼北大青鸟");
        Integer car=323;
        float f=2f;
        System.out.println(f);
        Scanner input=new Scanner(System.in);
        System.out.println("输入运算前的操作数字");
        float a=input.nextFloat();
        System.out.println("输入运算符+，-，*，/,%");
        String number=input.next();
        if(number=="+"||number=="-"||number=="*"||number=="/"||number=="%"){
            System.out.println("输入运算前的操作数字");
        }else {
            System.out.println("输入运算符+，-，*，/,%");
             number=input.next();
            System.out.println("输入运算前的操作数字");
        }
        float b=input.nextFloat();
        float numberf=0;
        switch (number){
            case "+":
                numberf=a+b;
                break;
            case "-":
                numberf=a-b;
                break;
            case "*":
                numberf=a*b;
                break;
            case "/":
                numberf=a/b;
                break;
            case "%":
                numberf=a%b;
                break;
        }
        System.out.println("计算结果:"+a+number+b+"="+numberf);
    }
}
