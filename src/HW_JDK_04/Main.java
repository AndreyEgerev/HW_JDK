package HW_JDK_04;

/*
Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник
должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник сотрудников
 */
public class Main {
    public static void main(String[] args) {
        HandBook handBook = new HandBook();
        handBook.addWorker(new Worker("8-988-800-70-60","Tom",3));
        handBook.addWorker(new Worker("8-988-800-90-90","Bob",5));
        handBook.addWorker(new Worker("8-988-090-60-90","Nina",1));
        handBook.addWorker(new Worker("8-988-900-90-90","Tom",1));

        System.out.println(handBook.getWorkerByID(2));
        System.out.println(handBook.getWorkerByExperience(1));
        System.out.println("Tom phone: " + handBook.getWorkerPhone("Tom"));

    }
}
