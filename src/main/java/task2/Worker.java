package task2;

public class Worker {
    private String name;
    private Desktop desktop;

    public Worker(String name) {
        this.name = name;
        desktop = new Desktop();
    }

    public Worker(String name, Desktop desktop) {
        this.name = name;
        this.desktop = desktop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Desktop getDesktop() {
        return desktop;
    }

    public void setDesktop(Desktop desktop) {
        this.desktop = desktop;
    }
}
