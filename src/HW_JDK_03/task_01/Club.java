package HW_JDK_03.task_01;

import java.util.NoSuchElementException;

public class Club <T extends Person>{
    T[] arrayT;
    public Club(T[] persons) {
        this.arrayT = persons;
    }

    // Метод активации всех элементов коллекции, реализованный через внутренний итератор
    public void start() {
//        for (T t : arrayT) {
//            try {
//                t.haveRest();
//            } catch (UnsupportedOperationException e) {
//                System.out.println(e.getMessage());
//            }
//        }
        ClubIterator clubIterator = new ClubIterator();
        while (clubIterator.hasNext()) {
            try {
                clubIterator.next().haveRest();
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public class ClubIterator {
        private int currentIndex;

        public ClubIterator() {
            currentIndex = 0;
        }

        public boolean hasNext() {
            return currentIndex < arrayT.length && arrayT[currentIndex] != null;
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            return arrayT[currentIndex++];
        }
    }
}
