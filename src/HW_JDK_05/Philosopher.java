package HW_JDK_05;

import java.util.Random;
import java.util.concurrent.Phaser;
import java.util.concurrent.Semaphore;

public class Philosopher extends Thread{
    private static final int TIME_EAT = 500;
    private static final int NUMBER_MEALS = 3;
    private final String name;
    private final int timeThink;
    private int countEat = 0;
    private final Semaphore table;
    private final Phaser eat;

    public Philosopher(String name, Semaphore table, Phaser eat) {
        this.name = name;
        this.timeThink = new Random().nextInt(300,1000);
        this.table = table;
        this.eat = eat;
        eat.register();
    }

    @Override
    public void run() {
        while (countEat < NUMBER_MEALS) {
            try {
                table.acquire();
                System.out.println(name + " wants to eat " + (countEat + 1) + " time");
                eat();
                System.out.println(name + " ate " + countEat + " times");
                table.release();
                think();
                if (countEat < NUMBER_MEALS) {
                    System.out.println(name + " go eat");
                    eat.arriveAndAwaitAdvance();
                } else {
                    eat.arriveAndDeregister();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void eat() {
        System.out.println(name + " eats " + (countEat + 1) + " times");
        try {
            Thread.sleep(TIME_EAT);
        } catch (InterruptedException e) {
            System.out.println(name + " is interrupted");
        }
        countEat++;
    }
    public void think() {
        System.out.println(name + " thinking..");
        try {
            Thread.sleep(timeThink);
        } catch (InterruptedException e) {
            System.out.println(name + " is interrupted");
        }
    }
}
