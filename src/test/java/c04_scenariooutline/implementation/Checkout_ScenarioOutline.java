package c04_scenariooutline.implementation;

public class  Checkout_ScenarioOutline {
    int dynamicTotal = 0;

    public void add (int qty, int price){

        dynamicTotal += (qty*price);
    }

    public int total(){

        return dynamicTotal;
    }
}
