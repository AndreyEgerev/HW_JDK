package HW_JDK_03.task_01;

import java.util.NoSuchElementException;

public class Work <T extends Person>{
    private final T[] arrayT;

    public Work(T[] persons) {
        this.arrayT = persons;
    }

    public void start() {
//        for (T t : arrayT) {
//            try {
//                t.doWork();
//            } catch (UnsupportedOperationException e) {
//                System.out.println(e.getMessage());
//            }
//        }
        WorkIterator workIterator = new WorkIterator();
        while (workIterator.hasNext()) {
            try {
                workIterator.next().doWork();
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public class WorkIterator {
        private int currentIndex;

        public WorkIterator() {
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
