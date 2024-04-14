package HW_JDK_03.task_04;
/*
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений
пары, а также переопределение метода toString(), возвращающее строковое представление пары.
 */
public class Pair<T,K> {
    private final T valueA;
    private final K valueB;

    public Pair(T valueA, K valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public T getFirst(){
        return valueA;

    };
    public K getSecond(){
        return valueB;
    }
    @Override
    public String toString() {
        return "first - " + valueA + ", second - " + valueB;
    }
}
