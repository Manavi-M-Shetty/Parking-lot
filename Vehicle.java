public class Vehicle {
    private int vehicleno;
    private vehicletype Vehicletype;
    private Parkingspot parkingspot;

    public int getVehicleno()
    {
        return this.vehicleno;
    }
    public void setVehicleno(int vehicleno)
    {
        this.vehicleno=vehicleno;
    }
    public vehicletype getvehicletype()
    {
        return this.Vehicletype;
    }
    public void setvehicletype(vehicletype Vehicletype)
    {
        this.Vehicletype=Vehicletype;
    }
    public Parkingspot getParkingspot()
    {
        return this.parkingspot;
    }
    public void setParkingspot(Parkingspot parkingspot)
    {
        this.parkingspot=parkingspot;
    }

}
