package stepanPackage.practice10.task2;

public class Client {
    public IChair chair;

    void sit() {
        System.out.println("Aperson has been sat");
    }

    void setChair(IChair chair) {
        this.chair = chair;
    }
}
