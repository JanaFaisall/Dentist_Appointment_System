public class Hospital {

    private int RoomNum;
    private Person persone;
    private Address address;

    public Hospital() {
        this(0, null, null);
    }

    public Hospital(int RoomNum, Person persone, Address address) {
        this.RoomNum = RoomNum;
        this.persone = persone;
        this.address = address;
    }

    public int getRoomNum() {
        return RoomNum;
    }

    public void setRoomNum(int RoomNum) {
        this.RoomNum = RoomNum;
    }

    public Person getPersone() {
        return persone;
    }

    public void setPersone(Person persone) {
        this.persone = persone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "RoomNum: " + RoomNum + "\nManeger:" + persone + "\naddress:" + address + "\n";
    }
}
