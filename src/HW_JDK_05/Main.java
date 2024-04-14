package HW_JDK_05;

import java.util.concurrent.CountDownLatch;
/*
Задание 1. В качестве задачи предлагается решить классическую задачу про обедающих философов
Условие:
● Есть пять философов (потоки), которые могут либо обедать (выполнение кода) либо размышлять (ожидание).
● Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд
● После каждого приема пищи философ должен размышлять
● Не должно возникнуть общей блокировки
● Философы не должны есть больше одного раза подряд
 */
/*
Создать два класс ObjectA, ObjectB
Реализовать класс в котором два потока вызовут DeadLock
 */
/*
Создайте два потока A и B.
Поток A меняет значение Boolean переменной switcher с задержкой 1000 миллисекунд (true в состояние false и наоборот).
Поток B ожидает состояния true переменной switcher и выводит на консоль обратный отсчет от 100 с задержкой 100
миллисекунд и приостанавливает свое действие, как только поток A переключит switcher в состояние false.
Условием завершения работы потоков является достижение отсчета нулевой отметки.
 */
/*
3 бегуна должны прийти к старту гонки
Программа должна гарантировать, что гонка начнется только когда все три участника будут на старте
Программа должна отсчитать “На старт”, “Внимание”, “Марш”
Программа должна завершиться когда все участники закончат гонку.
 */
public class Main {
    static boolean switcher = false;
    static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {

        DeadLock deadLock = new DeadLock();
        //deadLock.startDeadLock();

        Thread t1 = new Thread("T1"){
            @Override
            public void run() {
                synchronized (deadLock.first) {
                    System.out.println("Run t1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (deadLock.second){
                        System.out.println("Work");
                    }
                }
            }
        };
        Thread t2 = new Thread("T2"){
            @Override
            public void run() {
                synchronized (deadLock.second) {
                    System.out.println("Run t2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (deadLock.first){
                        System.out.println("Work ");
                    }
                }
            }
        };

        //t1.start();
        //t2.start();
//////////////////////////////////////////////////////
        // task 2

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                while (flag) {
                    switcher = !switcher;
                    System.out.println(switcher + " !");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                int count = 20;
                while (count != 0){
                        if (switcher) {
                            count--;
                            System.out.println(" " + switcher + " -> " + count);
                        }else {
                            switcher = !switcher;
                        }
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                flag = false;
                }

            };

        //thread1.start();
        //thread2.start();
///////////////////////////////////////////////////
        //task 3

        CountDownLatch latch = new CountDownLatch(3);
        CountDownLatch latch2 = new CountDownLatch(1);
        CountDownLatch latch3 = new CountDownLatch(3);


        Runnrer runnrerA = new Runnrer(2000,latch,latch2,latch3,"Tom");
        Runnrer runnrerB = new Runnrer(3000,latch,latch2,latch3,"Bob");
        Runnrer runnrerC = new Runnrer(1000,latch,latch2,latch3,"Mike");

        runnrerA.start();
        runnrerB.start();
        runnrerC.start();

        latch.await();

        System.out.println("On start");
        System.out.println("Ready..");
        System.out.println("Go");
        Runnrer.race = true;
        latch2.countDown();

        latch3.await();
        System.out.println("Finish!!");

    }
}
