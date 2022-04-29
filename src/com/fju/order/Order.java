package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;

    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
        shipFeed = delivery.price;
    }
    /*
    public int total() {
        if (shipFeed == 19 && amount >= 199) {
            shipFeed = 0;
        }
        return amount + shipFeed;
        public int total(){
            if (delivery instanceof ShopeeDelivery){

            }else {
                return amount + shipFeed;
            }
        }
    */
}

