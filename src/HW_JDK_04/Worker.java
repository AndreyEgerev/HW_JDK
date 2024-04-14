package HW_JDK_04;
/*
каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
 */
public class Worker {
    private static int countWorkerID = 1;
    private int workerID;
    private String numberPhone;
    private String name;
    private int workExperience;

    public Worker(int workerID, String numberPhone, String name, int workExperience) {
        this.workerID = workerID;
        countWorkerID = ++workerID;
        this.numberPhone = numberPhone;
        this.name = name;
        this.workExperience = workExperience;
    }

    public Worker(String numberPhone, String name, int workExperience) {
        workerID =countWorkerID;
        countWorkerID++;
        this.numberPhone = numberPhone;
        this.name = name;
        this.workExperience = workExperience;
    }

    public int getWorkerID() {
        return workerID;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getName() {
        return name;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    @Override
    public String toString() {
        return "Worker " + name +
                " ID = " + workerID +
                ", number phone ='" + numberPhone +
                ", work experience = " + workExperience;
    }
}
