package core;

import model.GSTRates;

public abstract class Accommodation implements Billing {


    public abstract double price();
    public abstract int getFreeConferenceRoomHours();

    public double totalAmount(int itemCount) {

        return itemCount >0 ? price() * itemCount + totalGst(itemCount) : 0;
    }

    public double totalGst(int itemCount) {
        return itemCount >0 ?  GSTRates.ACCOMMODATION.getGetGSTRate() * price()*itemCount : 0;
    }

    public  int getTotalFreeConferenceRoomHours(int itemCount){
        return itemCount >0 ? getFreeConferenceRoomHours()* itemCount : 0 ;
    }

    Accommodation getAccommodationBillingGenerator (String type){
        return  new OpenAccommodation();

    }

}

