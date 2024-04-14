package HW_JDK_03.task_01;

public class Idle implements Person{
    @Override
    public void doWork() {
        throw new UnsupportedOperationException("Idler cannot work.");
    }

    @Override
    public void haveRest() {
        System.out.println("Idler is having rest...");
    }
}
