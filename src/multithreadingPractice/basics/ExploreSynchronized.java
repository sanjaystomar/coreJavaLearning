package multithreadingPractice.basics;

import java.util.List;

public class ExploreSynchronized {

    public static void main(String[] args) throws InterruptedException {
        List<String> taskList = List.of("Lorem ipsum dolor sit amet consectetur adipiscing elit. Consectetur adipiscing elit quisque faucibus ex sapien vitae. Ex sapien vitae pellentesque sem placerat in id. Placerat in id cursus mi pretium tellus duis. Pretium tellus duis convallis tempus leo eu aenean.".split(" "));
//        System.out.println(taskList);
        ExploreSynchronized.Task t1 = new Task(taskList);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t1);
        Thread thread3 = new Thread(t1);

        thread1.setName("WORKER-1");
        thread2.setName("WORKER-2");
        thread3.setName("WORKER-3");

        thread1.start();
        thread2.start();
        thread3.start();

//        thread1.join();
//        thread2.join();
//        thread3.join();
        System.out.println("Done Processing !!");
    }

    static class Task implements Runnable{

        List<String> printQueue;
        Task(List<String> printQueue){
            this.printQueue = printQueue;
        }
        @Override

        public synchronized void run() {
            printQueue
                    .stream()
                    .limit(6)
                    .map(element -> element.toUpperCase())
                    .map(e ->  e.concat("_"+ Thread.currentThread().getName()))
                    .forEach(System.out::println);
        }
    }
}



