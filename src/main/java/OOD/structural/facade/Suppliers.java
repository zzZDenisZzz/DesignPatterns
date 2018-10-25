package OOD.structural.facade;

class Suppliers implements Order {
    public void add() {
        System.out.println("Заказ принял поставщик");
    }
}
