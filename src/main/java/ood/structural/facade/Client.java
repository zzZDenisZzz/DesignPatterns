package ood.structural.facade;

public class Client {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();
        callCenter.acceptOrder();
    }
}
