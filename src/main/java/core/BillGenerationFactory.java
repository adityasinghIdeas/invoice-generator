package core;

import model.BillType;

public class BillGenerationFactory {

    public static  Billing getBillingFactory(BillType billType){
        if (billType == BillType.MEAL){
            return new Meal();
        }else if(billType == BillType.CABIN_SEATING){
            return new CabinAccommodation();
        }else if(billType == BillType.OPEN_SEATING){
            return new OpenAccommodation();
        }else if(billType == BillType.CONFERENCE_ROOM){
            return new ConferenceAccommodation();
        }
        else {
            throw new IllegalArgumentException("Invalid billing Type");
        }
    }
}
