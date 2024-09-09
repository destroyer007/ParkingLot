package entity;

public class FourWheelerSpot extends ParkingSpot{
    public FourWheelerSpot(int id, int floor) {
        super(id, floor);
        this.vehicleType = VehicleType.FOUR_WHEELER;
    }
}
