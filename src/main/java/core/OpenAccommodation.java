package core;

public class OpenAccommodation extends Accommodation {

    private static final int PRICE = 5000;
    private static final int FREE_CONFERENCE_ROOM_HOURS = 5;

    public int getFreeConferenceRoomHours() {
        return FREE_CONFERENCE_ROOM_HOURS;
    }

    public double price() {
        return PRICE;
    }
}
