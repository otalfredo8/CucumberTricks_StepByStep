package c01_intro.implementation;

public class Checkout {

    private int dynamicTotal = 0;

    public void add(int count, int price) {
        dynamicTotal += (count * price);
    }

    public int total() {
        return dynamicTotal;
    }
}
