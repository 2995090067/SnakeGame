package number;

public class Sum extends Father {
    @Override
    public void Age() {//重写，方法的覆盖
        System.out.println("sans");
    }
    public void Age(String anm) {
        System.out.println("sans"+anm);
    }
    public  void Age2(int anm){
        System.out.println("重载"+anm);
    };
}
