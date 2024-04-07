package HW_JDK_02;

public class FullstackDeveloper extends Developer{
    @Override
    public void developGUI() {
        System.out.println(this.getName() + " is programming GUI very well!");
    }

    @Override
    public void developBackend() {
        System.out.println(this.getName() + " is programming Backend so well!");
    }

    public FullstackDeveloper(String name, int age) {
        super(name, age);
    }
}
