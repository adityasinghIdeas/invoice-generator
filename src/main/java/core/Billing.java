package core;

public interface Billing {

    public double totalAmount(int itemCount);
    public double totalGst(int itemCount);
}
