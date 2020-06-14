package captor;

import overload.Lambda;
import overload.OverLoad;

public class ForTest {
    public static void main(String[] args) {

//        ((int a,int b) -> System.out.println(a+b));
        Object o= new OverLoad();



        for(int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println(" ");
        }
//        for (;;){
//            System.out.println("牛逼大浩哥！");
//        }
        for(int i=0;;i++){
            if(i>=6){
                return;
            }
            System.out.println("hao"+i);
        }

    }
}
