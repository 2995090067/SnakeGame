
package captor.string;

import overload.Lambda;
import overload.OverLoad;

public class StringNext {
    public static void main(String[] args) {
//        CharSequence subSequence(int a,int c);
        String abc="abcnxklsnhn333777";
        char a='a';
       String out=(String) abc.subSequence(0,6);//这其实就是截取字符串
        OverLoad.out(out);
        Integer next=9;
        String abcd= next.toString();
        System.out.println(abcd);
        int x=9;
        String y="sb";
//        LambdaTest.out(()-> System.out.println("ddd"));
    }
}
