package OOD.structural.facade;

class CallCenter {

    void acceptOrder(int product) {
        Storage storage = new Storage(0);
        Suppliers suppliers = new Suppliers();

        storage.add();

        if (product <= storage.products) {
            System.out.println("Есть в наличии");
        } else {
            suppliers.add();
        }

    }
}
