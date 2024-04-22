public class App {
    public static void main(String[] args) throws Exception{
        ParkingLot parkingLot=new ParkingLot(1, 1, 3);
        Vehicle vehicle1=new Vehicle(vehicletype.TRUCK);
        parkingLot.parkTheVehicle(vehicle1);

       

    }
}
