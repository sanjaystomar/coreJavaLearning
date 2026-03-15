package multithreadingPractice.basics;

import java.util.concurrent.Executors;

/**
 * THREAD-2 thread holds lock: false
 * THREAD-2 thread holds lock in increment2 : true
 * THREAD-1 thread holds lock: false
 * THREAD-1 thread holds lock in increment1 : true
 * COUNTER VALUE IS {1},  INCREMENTED BY THREAD {THREAD-2}
 * COUNTER VALUE IS {2},  INCREMENTED BY THREAD {THREAD-1}
 * THREAD-2 thread holds lock in increment2 : true
 * COUNTER VALUE IS {3},  INCREMENTED BY THREAD {THREAD-2}
 * THREAD-1 thread holds lock: false
 * THREAD-1 thread holds lock in increment1 : true
 * COUNTER VALUE IS {4},  INCREMENTED BY THREAD {THREAD-1}
 * THREAD-1 thread holds lock: false
 * THREAD-1 thread holds lock in increment1 : true
 * THREAD-2 thread holds lock: false
 * THREAD-2 thread holds lock in increment2 : true
 * COUNTER VALUE IS {6},  INCREMENTED BY THREAD {THREAD-2}
 * COUNTER VALUE IS {5},  INCREMENTED BY THREAD {THREAD-1}
 * THREAD-2 thread holds lock in increment2 : true
 * THREAD-1 thread holds lock: false
 * THREAD-1 thread holds lock in increment1 : true
 * COUNTER VALUE IS {7},  INCREMENTED BY THREAD {THREAD-1}
 * COUNTER VALUE IS {8},  INCREMENTED BY THREAD {THREAD-2}
 *
 *
 *
 * Runnable runnable = ...
 *
 *    // Start a daemon thread to run a task
 *    Thread thread = Thread.ofPlatform().daemon().start(runnable);
 *
 *    // Create an unstarted thread with name "duke", its start() method
 *    // must be invoked to schedule it to execute.
 *    Thread thread = Thread.ofPlatform().name("duke").unstarted(runnable);
 *
 *    // A ThreadFactory that creates daemon threads named "worker-0", "worker-1", ...
 *    ThreadFactory factory = Thread.ofPlatform().daemon().name("worker-", 0).factory();
 *
 *    // Start a virtual thread to run a task
 *    Thread thread = Thread.ofVirtual().start(runnable);
 *
 *    // A ThreadFactory that creates virtual threads
 *    ThreadFactory factory = Thread.ofVirtual().factory()
 */
public class SynchronizationRawExample3 {

    public static int counter1 = 0;

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    //    public static Object lock2 = new Object();
    public static void increment1() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " thread holds lock in increment1 : " + Thread.holdsLock(lock1));
            counter1++;
            System.out.println("COUNTER VALUE IS {" + counter1 + "},  INCREMENTED BY THREAD {" + Thread.currentThread().getName() + "}");
        }
    }

    public void increment2() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName() + " thread holds lock in increment2 : " + Thread.holdsLock(lock2));
            counter1++;
            System.out.println("COUNTER VALUE IS {" + counter1 + "},  INCREMENTED BY THREAD {" + Thread.currentThread().getName() + "}");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1000);
        SynchronizationRawExample3 example1 = new SynchronizationRawExample3();
        SynchronizationRawExample3 example2 = new SynchronizationRawExample3();
        example1.process1();
        example2.process1();
//  TODO SSTOMAR :this creates threads using builder in Thread Class
       /* Thread.ofPlatform().start(() -> {
            for (int i = 0; i < 2; i++) {
                System.out.println(Thread.currentThread().getName() + " thread holds lock: " + Thread.holdsLock(lock1));
                increment1();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).setName("USING_BUILDER");*/


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
                System.out.println(Thread.currentThread().getName() + " thread holds lock: " + Thread.holdsLock(lock2));
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
//        t1.interrupt();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
