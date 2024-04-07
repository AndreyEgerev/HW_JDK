package HW_JDK_02;

/*
Дописать третье задание таким образом, чтобы в идентификатор типа Developer записывался объект Frontender,
и далее вызывался метод developGUI(), не изменяя существующие интерфейсы, только код основного класса

Описать команду разработчиков. В команде разработчиков могут находиться бэкендеры,
которые в состоянии писать серверный код, фронтендеры,
которые могут программировать экранные формы, и фуллстэк разработчики, совмещающие в себе обе компетенции.
Реализовать класс фулстэк разработчика, создать экземпляр и последовательно вызвать
все его методы.
 */
public class Main {
    public static void main(String[] args) {
        BackendDeveloper backendDev = new BackendDeveloper("John", 35);
        FrontendDeveloper frontendDev = new FrontendDeveloper("Bob", 42);
        FullstackDeveloper fullstackDev = new FullstackDeveloper("Mike", 24);

        fullstackDev.developBackend();
        fullstackDev.developGUI();

        Developer frontDev = new FrontendDeveloper("Nick",37);

        frontDev.developBackend();
        frontDev.developGUI();

    }
}