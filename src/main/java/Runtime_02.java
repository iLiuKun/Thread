import java.io.IOException;

public class Runtime_02 {
    public static void main(String args[]) throws IOException, InterruptedException {
//        Runtime run = Runtime.getRuntime() ;	// 取得Runtime类的实例化对象
//        try{
//            run.exec( new String[]{"/System/Applications/Utilities/Terminal.app","ffplay http://qncdn.zhangying.pursue.show/1.mp4"}) ;	// 调用本机程序，此方法需要异常处理
//        }catch(Exception e) {
//            e.printStackTrace();    // 打印异常信息
//            // System.out.println(e) ;
//        }
        Process process = Runtime.getRuntime().exec("/usr/local/bin/ffplay http://qncdn.zhangying.pursue.show/1.mp4");

        process.waitFor();



    }
}