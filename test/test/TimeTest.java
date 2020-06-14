package test;

import overload.OverLoad;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {
    private static final SimpleDateFormat fmt=new SimpleDateFormat("HH:mm:ss");
    public interface Task{
        void execute();
    }
    public static void test(String title,Task task){
        if(task==null){
            return;
        }
        title =(title==null)? "":("<"+title+">");
        OverLoad.out(title);
        OverLoad.out("开始"+fmt.format(new Date()));
        long begin=System.currentTimeMillis();
        task.execute();
        long end=System.currentTimeMillis();
        OverLoad.out("结束："+ fmt.format(new Date()));
        double dela=(end-begin)/1000.0;
        OverLoad.out("耗时"+dela+"秒");
        OverLoad.out("============================");

    }
}
