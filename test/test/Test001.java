package test;

import jdk.internal.dynalink.beans.StaticClass;

public class Test001 {
//    在idea中查找类,展示类,快速查找某个类或方法在整个项目中的位置
//    本文链接：https://blog.csdn.net/qq_36901488/article/details/80704245
//    知道类名查找类:Ctrl+Shift+Alt+N;
    static {
        System.out.println("我是静态代码块，在类加载时就出现，只执行一次！");
    }
    static final String adress="中国";
    static final String Sex="男";
    static  String ASex="女";
    public Test001(){
        this(1999,12,11);
    }
    public Test001(int year,int mouth,int day){
        System.out.println(year+":"+mouth+":"+day);
    }
    public void other(){
        System.out.println("other");
    }
    public void doother(){
        System.out.println("dother");
        other();
    }
    static  int amn=0;
    public static void main(String[] args) {
        newws(10);
        news("news女news");
        System.out.println(Test001.ASex="zh");
        System.out.println(Test001.ASex);
        System.out.println(Test001.ASex="男");
        Test001 oo=new Test001();
        oo.doother();
        System.out.println(oo);
        Test001.amn=9;
        System.out.println(Test001.amn);
       User u=new User(20);
       User a=new User(33);
        add(u);
        System.out.println("main里age的值："+u.age);
        System.out.println("a的对象的里面的age的值："+a.age);
        cHengFaKoJ();
    }
    static {
         {
            System.out.println("aa");
        }

    }
    static void newws(int aa){
        for (aa=0;aa<=9;aa++)
            System.out.println("hellewold");
    }
     static void news(String ax){
        Test001.ASex=ax;
        System.out.println("我是静态方法新闻,作者是"+Test001.ASex+"xing");

    }

    static  void cHengFaKoJ(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
    private static void add(User u) {
        u.age++;
        System.out.println("add方法里age的值是："+u.age);
    }
}
    class User{
     int age;
      public User(){};
      public User(int age){
           this.age=age;
           System.out.println("构造方法里传来的age的值是--->"+age);
    };
    class Test{
       int age;
       int id;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    } ;
    static {
        System.out.println("我是牛逼");
        System.out.println(Test001.ASex);
    }

}
