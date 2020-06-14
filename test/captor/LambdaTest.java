package captor;


import out.Out;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
    static class jj{
        static void Astring(int abc) {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int abcs=99;
//        jj.Astring(abcs-> System.out.println("我是"+abcs+"ssssssssssss"));
        Event event=()-> System.out.println("李四");
        event.add();
        Events eventd=(cd)->System.out.println("我是张三，我今年"+cd+"岁");
        Events eventdss=(cd)->{
            cd=cd+1;
            System.out.println("我是张三，我今年"+cd+"岁");

        };

        eventdss.adds(88);
        Events eventds=(cd)->{System.out.println("我是张三，我今年"+cd+"岁");
            System.out.println("我是王八蛋，我今天吃了"+cd+"个咸鸭蛋");
            System.out.println("我是渣渣辉");
        };
        eventd.adds(17);
        eventds.adds(17);
        Eventss s=(ss,dd)-> ss+dd;
        Eventss qs=(ss,dd)-> ss*dd;
        int qd=qs.add(88,2);
        System.out.println(qd);
      int dd=  s.add(77,88);
        System.out.println(dd);
        jieko j1=()-> System.out.println("11111");
        j1.method();
        jieko1 j2=(int a,int b)-> a+b;
        Out.out(j2.method(2,6));

        jieko2 j3=(int sa)->new String(s+"qqqq");
        jieko2 j33=(int sa)->(s+"qqqq");
        Out.out(j3.method(6));
//        List<animal> animals=new ArrayList<>();
//        animals.add(new animal(7,6,"张三"));
//        List<ListTest> sd=(int ids,int  sexs,String names)-> {
//            return List;
//        };


    }
}
interface Event{
    void add();
}
@FunctionalInterface
interface Eventss{
    int  add(int id,int dd);
}
interface Events{
  void  adds(int id );
}

interface jieko{
    void method();
}
interface ListTest{
    List<animal>ANIMALS(int id,int sb,String abc);
}
interface ListTests<animal>{
    List<infca>ANIMALS(int id,int sb,String abc);
}
class infca{
    int id;
}
interface jieko1{
    int method(int a ,int b);
}

interface jieko2{
    String method(int c);
}




class EventImpl implements Event{

    @Override
    public void add() {
        System.out.println("zhangsan");
    }
}
 class animal{
    int id;
    int sex;
    String name;

     public animal() {
     }

     public animal(int id, int sex, String name) {
         this.id = id;
         this.sex = sex;
         this.name = name;
     }

     @Override
     public String toString() {
         return "animal{" +
                 "id=" + id +
                 ", sex=" + sex +
                 ", name='" + name + '\'' +
                 '}';
     }
 }
 class ArrysListTest<T>{

 }
 class intsface{
    public int abc;
 }
class intTest<intsface>{
    String ac;
    int asc;
    public int abc;
}
