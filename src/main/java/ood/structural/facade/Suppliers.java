package ood.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Suppliers implements Order {
    public void add() {
        log.info("Заказ принял поставщик");
    }
}
