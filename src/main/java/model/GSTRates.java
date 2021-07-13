package model;

public enum GSTRates {
    ACCOMMODATION(0.18),MEAL(0.12);

    double getGSTRate;


    GSTRates(double getGSTRate) {
        this.getGSTRate = getGSTRate;
    }

    public double getGetGSTRate() {
        return getGSTRate;
    }
}
