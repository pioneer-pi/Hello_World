package normal_code.P10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Test{
    public static void main(String[] args) throws IOException {
//        try{
//            getThrows1();
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
        getMyException2();

    }
    private static void getThrows1() throws IOException,InterruptedException{
        Files.readString(Path.of("A:/aa/aa"));
        Thread.sleep(1000);
    }
    //throws语句不属于方法签名

    private static void getMyException(){
        if (1==1){
            throw new MyException("1=1,错了");
        }
    }

    private static void getMyException2(){
        try{
            Files.readString(Path.of("A:/aa.aa"));
        }catch (IOException e){
            throw new MyException("读取文件错误! " + e.getMessage());
        }
    }
    private static double divide(double divisor,double dividend){
        if(dividend == 0){
            throw new MyException("被除数为空!");
        }
        return divisor / dividend;
    }
}
