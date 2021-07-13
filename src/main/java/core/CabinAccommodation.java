package core;

public class CabinAccommodation extends Accommodation {
    private static final int PRICE = 10000;
    private static final int FREE_CONFERENCE_ROOM_HOURS = 10;

    public int getFreeConferenceRoomHours() {
        return FREE_CONFERENCE_ROOM_HOURS;
    }

    public double price() {
        return PRICE;
    }
}
