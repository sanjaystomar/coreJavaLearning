package multithreadingPractice.basics;

/**
 * THREAD-1 thread holds lock: false
 * THREAD-2 thread holds lock: false
 * THREAD-1 thread holds lock in increment1 : true
 * COUNTER VALUE IS {1},  INCREMENTED BY THREAD {THREAD-1}
 * THREAD-2 thread holds lock in increment2 : true
 * COUNTER VALUE IS {2},  INCREMENTED BY THREAD {THREAD-2}
 * THREAD-1 thread holds lock: false
 * THREAD-2 thread holds lock in increment2 : true
 * COUNTER VALUE IS {3},  INCREMENTED BY THREAD {THREAD-2}
 * THREAD-1 thread holds lock in increment1 : true
 * COUNTER VALUE IS {4},  INCREMENTED BY THREAD {THREAD-1}
 * THREAD-1 thread holds lock: false
 * THREAD-1 thread holds lock in increment1 : true
 * COUNTER VALUE IS {5},  INCREMENTED BY THREAD {THREAD-1}
 * THREAD-2 thread holds lock: false
 * THREAD-2 thread holds lock in increment2 : true
 * COUNTER VALUE IS {6},  INCREMENTED BY THREAD {THREAD-2}
 * THREAD-1 thread holds lock: false
 * THREAD-2 thread holds lock in increment2 : true
 * COUNTER VALUE IS {7},  INCREMENTED BY THREAD {THREAD-2}
 * THREAD-1 thread holds lock in increment1 : true
 * COUNTER VALUE IS {8},  INCREMENTED BY THREAD {THREAD-1}
 */
public class SynchronizationRawExample2 {

    public static int counter1 = 0;
    public static int counter2 = 0;

    public static Object lock1 = new Object();

    //    public static Object lock2 = new Object();
    public static void increment1() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " thread holds lock in increment1 : " + Thread.holdsLock(lock1));
            counter1++;
            System.out.println("COUNTER VALUE IS {" + counter1 + "},  INCREMENTED BY THREAD {" + Thread.currentThread().getName() + "}");
        }
    }

    public void increment2() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " thread holds lock in increment2 : " + Thread.holdsLock(lock1));
            counter1++;
            System.out.println("COUNTER VALUE IS {" + counter1 + "},  INCREMENTED BY THREAD {" + Thread.currentThread().getName() + "}");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1000);
        SynchronizationRawExample2 example1 = new SynchronizationRawExample2();
        SynchronizationRawExample2 example2 = new SynchronizationRawExample2();
        example1.process1();
        example2.process1();
    }

    public void process1() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println(Thread.currentThread().getName() + " thread holds lock: " + Thread.holdsLock(lock1));
                    increment1();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " thread holds lock: " + Thread.holdsLock(lock1));
                for (int i = 0; i < 2; i++) {
                    increment2();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.setName("THREAD-1");
        t2.setName("THREAD-2");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
