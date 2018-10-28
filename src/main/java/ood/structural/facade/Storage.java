package ood.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Storage implements Order {
    int products;

    Storage(int products) {
        this.products = products;
    }

    public void add() {
        log.info("Заказ принял склад");
    }
}
