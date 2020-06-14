package captor;

import overload.OverLoad;

import javax.imageio.stream.IIOByteBuffer;

public class Captor {
    public static void main(String[] args) {
        OverLoad.out("sb");
        OverLoad.out("计算从4到9的和");
//        OverLoad.out(OverLoad.num(4,9));
        System.out.println(OverLoad.num(4,9));
        int n=5;
        System.out.println(sun(n));

        for (int i=0;;i++){
//            if (x <= sizeTable[i])
////                return i+1;
            System.out.println("over"+i);
        }


    }

    private static int sun(int n) {
        if(n==1){
            return 1;
        }
       return n+sun(n-1);
    }
//    static int stringSize(int x) {
//        for (int i=0; ; i++)
//            if (x <= sizeTable[i])
//                return i+1;
//    }


}
