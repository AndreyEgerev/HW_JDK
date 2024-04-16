package HW_JDK_05;

import java.util.ArrayList;
import java.util.concurrent.Phaser;
import java.util.concurrent.Semaphore;
/*
Задание 1. В качестве задачи предлагается решить классическую задачу про обедающих философов
Условие:
● Есть пять философов (потоки), которые могут либо обедать (выполнение кода) либо размышлять (ожидание).
● Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд
● После каждого приема пищи философ должен размышлять
● Не должно возникнуть общей блокировки
● Философы не должны есть больше одного раза подряд
 */
public class Main {
    private static final int NUMBER_SEATS = 1;
    public static void main(String[] args) {
        Phaser eat = new Phaser(1);
        Semaphore dinnerTable = new Semaphore(NUMBER_SEATS);
        ArrayList<Philosopher> university = new ArrayList<>();
        university.add(new Philosopher("Aristotle", dinnerTable, eat));
        university.add(new Philosopher("Nietzsche", dinnerTable, eat));
        university.add(new Philosopher("Kant", dinnerTable, eat));
        university.add(new Philosopher("Socrates", dinnerTable, eat));
        university.add(new Philosopher("Schopenhauer", dinnerTable, eat));

        for (Philosopher philosopher:
             university) {
            philosopher.start();
        }

        eat.arriveAndDeregister();
        if (eat.isTerminated()) {
            System.out.println("Everyone ate");
        }
    }
}
