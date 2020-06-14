import javax.sound.midi.Soundbank;
import javax.swing.colorchooser.ColorChooserComponentFactory;
import java.util.Scanner;
import java.util.zip.ZipInputStream;

/**
 * Test0001
 */
public class Test0001 {
    /**
     * main方法
     * @param args
     */
    public static void main(String[] args) {
        String zhangsan="李四";
        zhangsan(zhangsan);
        System.out.println(zhangsan);
        float id=0.0f;
        float ids=0.01f;
        double ib=0.00d;
        int a1,b,c1=9;
        int ac=1,bc=0;
        int ww;
        System.out.println(c1);
        Scanner input=new Scanner(System.in);
        System.out.println();
        char a='a';
        System.out.println("a的unicode的编码："+Integer.toHexString(a));
        Integer i=1111;
//        String.format(i);
        System.out.println();
        int x=0;
        int y=8;
        int num=x>y?20:10;
        System.out.println(num);
        boolean num1=(x!=y)&&(x<y);
        boolean num2=(x!=y)&&(x>y);
        boolean num3=(x!=y)||(x>y);
        boolean num4=(x==y)||(x<y);
        boolean num5=(x<y)||(x==y);
        boolean num6=(x!=y)||(x<y);
        boolean num7=(x==y)||(x>y);
        System.out.println("num1===>"+num1+"num2===>"+num2);
        System.out.println("num3===>"+num3+"num4===>"+num4);
        System.out.println("num5===>"+num5+"num6===>"+num6);
        System.out.println("num7===>"+num7);
        Test00012(0,1);
        int year=1993;
        switch (year%12){
                case 1:
                    System.out.println("鸡");
                    break;
                default:
                    System.out.println("XX");
        }
    }
static void zhangsan(String zhangsan){
         zhangsan="王五";
    System.out.println("输出的是："+zhangsan);
}
    /**
     * 静态方法，参数是int n和x
     * @param n
     * @param x
     */
    static void Test00012(int n,int x){
        int z=0;
        while (x<=100){
            n+=x++;
            z=x;
            System.out.println("n的值是"+n);
            System.out.println("z的值是"+z);
            if(x>55){
                break;
            }
        }
    }
    static void Test00(){
        Car car =new Car();
        Beatles beatles=new Beatles();
        BealtesCar bealtesCar= new BealtesImpl();
        bealtesCar.sayBealtes(car,beatles);
    }
    static class testNei {
        int Public=22;

    }
}
