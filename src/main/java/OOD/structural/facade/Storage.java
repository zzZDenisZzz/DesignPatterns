package OOD.structural.facade;

public class Storage implements Order {
    int products;

    Storage(int products) {
        this.products = products;
    }

    public void add() {
        System.out.println("Заказ принял склад");
    }
}
