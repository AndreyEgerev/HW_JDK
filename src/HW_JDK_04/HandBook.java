package HW_JDK_04;

import java.util.ArrayList;
import java.util.List;

/*
Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник сотрудников
 */
public class HandBook {
    private final List<Worker> workers;

    public HandBook(List<Worker> workers) {
        this.workers = workers;
    }

    public HandBook(Worker worker) {
        workers = new ArrayList<>();
        workers.add(worker);
    }

    public HandBook() {
        workers = new ArrayList<>();
    }

    public void addWorker(Worker worker){
        workers.add(worker);

    }

    public Worker getWorkerByID (int workerID){
        for (Worker worker:
             workers) {
            if (worker.getWorkerID() == workerID) return worker;
        }
        return null;
    }

    public List<Worker> getWorkerByExperience (int experience){
        List<Worker> workersExp = new ArrayList<>();
        for (Worker worker:
             workers) {
            if (worker.getWorkExperience() == experience){
                workersExp.add(worker);
            }
        }
        return workersExp;
    }

    public List<String> getWorkerPhone(String nameWorker){
        List<String> phones = new ArrayList<String>();
        for (Worker worker:
             workers) {
            if (worker.getName().equals(nameWorker)) phones.add(worker.getNumberPhone());
        }
        return phones;
    }

}
