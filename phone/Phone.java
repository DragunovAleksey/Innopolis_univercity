package phone;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public void receiveCall (String name) {
        System.out.println("Звонит " + name);
    }

    public int getNumber() {
        return number;
    }
    public Phone(int number, String model, int weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
}
