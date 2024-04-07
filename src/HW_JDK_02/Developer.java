package HW_JDK_02;

class Developer implements FrontendWork, BackendWork{

    private String name;
    private int age;

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public void developGUI() {
        System.out.println(this.name + " is programming GUI very bad!");
    }

    @Override
    public void developBackend() {
        System.out.println(this.name + " is programming Backend very bad!");
    }
}
