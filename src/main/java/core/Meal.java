package core;

import model.GSTRates;

public class Meal implements Billing {

    private static final int PRICE = 100;


    @Override
    public double totalAmount(int itemCount) {
        return itemCount >0 ?  PRICE * itemCount + totalGst(itemCount) : 0;
    }

    @Override
    public double totalGst(int itemCount) {
        return itemCount >0 ?  PRICE * itemCount * GSTRates.MEAL.getGetGSTRate(): 0;
    }
}
