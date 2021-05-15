package normal_code.P11Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//定时器指定定时任务
public class TimerTest {
    public static void main(String[] args) throws ParseException{
//        Timer timer = new Timer(true);//守护线程
        Timer timer = new Timer();
//        timer.schedule(定时任务，第一次任务执行时间，间隔)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2021-05-07 20:45:00");

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //编写需要执行的任务
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String strTime = sdf.format(new Date());
                System.out.println(strTime + "：成功完成了一次数据备份！");
            }
        }, firstTime, 1000 * 10);

    }
}

//编写一个定时任务类
//假设是记录日志的定时任务