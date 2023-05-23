package phone;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone(222222, "Sony", 120);
        Phone phone2 = new Phone(333333, "HTC", 140);
        Phone phone3 = new Phone(555555, "Samsung", 150);

        phone1.receiveCall("Vasya");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Petya");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("Masha");
        System.out.println(phone2.getNumber());



    }
}
