package HW_JDK_03;


import HW_JDK_03.task_01.*;
import HW_JDK_03.task_02.Calculate;
import HW_JDK_03.task_03.CompareArray;
import HW_JDK_03.task_04.Pair;

/*
Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
££££££££££££££££££££££
. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два
числа разного типа, над которыми должна быть произведена операция.
£££££££££££££££££££££££££££
Напишите обобщенный метод compareArrays(), который принимает два массива и
возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть
любого типа данных, но должны иметь одинаковую длину и содержать элементы одного
типа.
££££££££££££££££££££££££££££££££££££££
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений
пары, а также переопределение метода toString(), возвращающее строковое представление пары.
 */
public class Main {
    public static void main(String[] args) {
        //task 1
        Person[] persons = {new Worker(), new Idle(), new Worker(), new Worker()};
        Work<Person> workplace = new Work<>(persons);
        Club<Person> club = new Club<>(persons);
        workplace.start();
        System.out.println("-".repeat(10));
        club.start();

        //tack 2
        System.out.println("-".repeat(20));
        System.out.println(Calculate.sum(2,2));
        System.out.println(Calculate.divide(15,2));
        System.out.println(Calculate.subtract(2.5f,2.1d));
        System.out.println(Calculate.multiply(2L,2.0d));

        //task 3
        System.out.println("-".repeat(20));
        Integer[] array1 = {1,2,3,4,5,6,7};
        Integer[] array2 = {1,2,3,4,5,6,7};
        String[] array3 = {"1","2","3","4","5","6","7"};
        Integer[] array4 = {2,3,4};

        System.out.println(CompareArray.compareArrays(array1,array2));
        System.out.println(CompareArray.compareArrays(array1,array4));
        System.out.println(CompareArray.compareArrays(array1,array3));

        // task 4
        System.out.println("-".repeat(20));
        Pair value = new Pair(100, "100");
        System.out.println(value.getFirst());
        System.out.println(value);

    }
}
