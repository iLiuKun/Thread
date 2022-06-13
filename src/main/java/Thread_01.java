public class Thread_01 {

    //赋值是原子操作，加减不是，需要synchronized
    //因此，用synchronized修饰的方法就是同步方法，它表示整个方法都必须用this实例加锁。
    public static void main(String[] args) {
        System.out.println("main start...");
        System.out.println(Thread.currentThread().getName()+"000000"+Thread.currentThread().getId());
        Thread t = new Thread() {
            public void run() {
                System.out.println("thread run...");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {}
                System.out.println("thread end.");
            }
        };
        t.start();
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try {
//            Thread.sleep(20);
//        } catch (InterruptedException e) {}
        System.out.println("main end...");
    }
}
