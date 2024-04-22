public class Parkingspot {
    private ParkingSpotType parkingspottype;
    private boolean isFree;
    private Vehicle vehicle;
    public Parkingspot(ParkingSpotType parkingspottype)
    {
        this.parkingspottype=parkingspottype;
    }

    public ParkingSpotType getpParkingSpotType()
    {
        return this.parkingspottype;
    }
    public void setParkingSpotType(ParkingSpotType parkingSpotType)
    {
        this.parkingspottype=parkingspottype;
    }
    public boolean getisFree()
    {
        return this.isFree;
    }
    public void setisFree(boolean isFree)
    {
        this.isFree=isFree;
    }
    public Vehicle getVehicle()
    {
        return this.vehicle;
    }
    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle=vehicle;
    }


}
