package entity;

public class Ticket {
    int id;
    int startTime;
    int endTime;
    Vehicle vehicle;
    float amount;

    public Ticket(int id, int startTime, Vehicle vehicle, float amount) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = -1;
        this.vehicle = vehicle;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", vehicle=" + vehicle +
                ", amount=" + amount +
                '}';
    }
}
