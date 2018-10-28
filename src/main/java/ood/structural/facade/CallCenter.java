package ood.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class CallCenter {

    void acceptOrder() {
        Storage storage = new Storage(0);
        Suppliers suppliers = new Suppliers();
        storage.add();

        if (1 <= storage.products) {
            log.info("Есть в наличии");
        } else {
            suppliers.add();
        }
    }
}
