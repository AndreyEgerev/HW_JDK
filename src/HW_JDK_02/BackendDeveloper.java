package HW_JDK_02;

public class BackendDeveloper extends Developer{
    public BackendDeveloper(String name, int age) {
        super(name, age);
    }

    @Override
    public void developBackend() {
        System.out.println(super.getName() + " is programming Backend very well!");
    }
}
