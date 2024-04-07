package HW_JDK_02;

public class FrontendDeveloper extends Developer{
    public FrontendDeveloper(String name, int age) {
        super(name, age);
    }

    @Override
    public void developGUI() {
        System.out.println(this.getName() + " is programming GUI very well!");
    }
}
