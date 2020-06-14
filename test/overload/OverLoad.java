package overload;

public class OverLoad {
    public static  void out(){
        System.out.println();
    };
    public static  void out(String a){
        System.out.println(a);
    };
    public static  void out(Object a){
        System.out.println(a);;
    };
    public static void out(int a){
        System.out.println(a);
    };
//    public static int out(int a){
//        return 1;
//    };
    public static  int num(int a, int b) {
        int c=0;
        if(a<=0){
            c=b-a+1;
        }else {
            c=b-a;
        }
        int d=(a+b)*c/2;
        return d;
    }
    public static void out(double a){
        System.out.println(a);
    }


}
