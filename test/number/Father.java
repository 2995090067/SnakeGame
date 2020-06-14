package number;

public  abstract class Father {
    String name;
    int age;
    protected abstract void Age();
    public  void Age2(String anm){
        System.out.println("重载"+anm);
    };
}
