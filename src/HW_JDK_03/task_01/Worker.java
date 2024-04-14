package HW_JDK_03.task_01;

public class Worker implements Person{
    @Override
    public void doWork() {
        System.out.println("Worker is working.");
    }

    @Override
    public void haveRest() {
        throw new UnsupportedOperationException("Worker cannot have rest.");
    }
}
