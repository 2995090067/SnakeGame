package test;

import out.Out;

import java.util.function.Predicate;

public class Test002 {


    public static void main(String[] args) {
        String Scat="mao";
//        Scat="gou";
        TestOne Sone=(A)-> System.out.println("我养了一只"+Scat);
//        Out.out(Sone.animal(Scat));
        Sone.animal(Scat);
//        int an=8;
//        an=9;
//        TestOnes t2=(ADDD)->an+8;
        Predicate<Integer> altester=x->x>5;
//        Predicate<Integer> altestesr=x->x+5;
        String A12="777A";
        int aaa=77;
    TestOne2 on=(A,B)-> System.out.println(A12+7+aaa);
    on.animal(A12,aaa);
    }
}
@FunctionalInterface
interface TestOnes{
    void animal(int animal);
}
interface TestOne{
    void animal(String animal);
}
interface TestOne2<Intager>{
    void animal(String animal,int acd);
}
