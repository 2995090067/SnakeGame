package captor.string;

import out.Out;
import overload.OverLoad;

import javax.naming.Name;

public class HelloTest {
    public static void main(String[] args) {
        Hello hello=(name,words)-> name+words;
        Hello hello2=(name,words)-> {return name+"是"+words+"爱吃XX";};
        String words=hello.hello("李四","我是一个动物");
        OverLoad.out(words);
        Computed computed=(a,b)->a+b;
        Computed computed2=(a,b)->a-b;
        Computed computed3=(a,b)->a*b;
    }
}
