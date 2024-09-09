package entity;

public class TwoWheelerSpot extends ParkingSpot{

    public TwoWheelerSpot(int id, int floor) {
        super(id, floor);
        this.vehicleType = VehicleType.TWO_WHEELER;
    }
}
