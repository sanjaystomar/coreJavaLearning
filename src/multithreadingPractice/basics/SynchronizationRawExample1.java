package multithreadingPractice.basics;

public class SynchronizationRawExample1 {

    public static volatile int counter=0;

    public static synchronized void increment() {
        counter++;
        System.out.println("COUNTER VALUE IS {"+counter+"},  INCREMENTED BY THREAD {"+Thread.currentThread().getName()+"}");
        System.out.println(Thread.currentThread().getName() +" thread holds monitor: "+ Thread.holdsLock(SynchronizationRawExample1.class));
    }

    public synchronized void decrement() {
        counter--;
        System.out.println("COUNTER VALUE IS {"+counter+"},  DECREMENTED BY THREAD {"+Thread.currentThread().getName()+"}");
        System.out.println(Thread.currentThread().getName() +" thread holds monitor: "+ Thread.holdsLock(SynchronizationRawExample1.class));
    }

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1000);
        SynchronizationRawExample1 example1=  new SynchronizationRawExample1();
        SynchronizationRawExample1 example2=  new SynchronizationRawExample1();
        example1.process1();
        example2.process1();
    }

    public void process1() {
        Thread t1 =  new Thread(new Runnable () {
            @Override
            public void run() {
                for(int i=0; i<5;i++) {
                    increment();
                    decrement();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 =  new Thread(new Runnable () {
            @Override
            public void run() {
                for(int i=0; i<5;i++) {
                    decrement();
                    increment();
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

//	public static void process() {
//		Thread t1 =  new Thread(new Runnable () {
//			@Override
//			public void run() {
//				for(int i=0; i<10;i++) {
//					increment();
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//		});
//
//		Thread t2 =  new Thread(new Runnable () {
//			@Override
//			public void run() {
//				for(int i=0; i<10;i++) {
//
//					increment();
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//		});
//
//		t1.setName("THREAD-1");
//		t2.setName("THREAD-2");
//		t1.start();
//		t2.start();
//
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

}
