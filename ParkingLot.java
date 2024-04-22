import java.util.*;
public class ParkingLot {
    int LargeSpotSize;
    int CompactSpotSize;
    int BikeSpotSize;
    List<Parkingspot> LargeParkingSpotList;
    List<Parkingspot> CompactParkingSpotList;
    List<Parkingspot> BikeParkingSpotList;
    public ParkingLot(int LargeSpotSize,int CompactSpotSize,int BikeSpotSize)
    {
        this.BikeSpotSize=BikeSpotSize;
        this.LargeSpotSize=LargeSpotSize;
        this.CompactSpotSize=CompactSpotSize;

        LargeParkingSpotList=new Arraylist<>();
        CompactParkingSpotList=new Arraylist<>();
        BikeParkingSpotList=new Arraylist<>();


    }
    

    public void(Vehicle vehicle)
    {
        System.out.println("we are parking the vehicle");
        if(vehicletype.TRUCK.equals(vehicle.getvehicletype()))
        {
            if(LargeSpotSize>0)
            {
                parkLargeVehicle(vehicle);
            }
            else
            {
                System.out.println("Large parking not availaible");
            }
         

        }
        else if(vehicletype.CAR.equals(vehicle.getvehicletype()))
        {
            if(CompactSpotSize>0)
            {
                parkCompactVehicle(vehicle);
            }
            else
            {
                System.out.println("Compact parking not availaible");
            }

        }
        else if(vehicletype.BIKE.equals(vehicle.getvehicletype()))
        {
            if(BikeSpotSize>0)
            {
                parkLargeVehicle(vehicle);
            }
            else
            {
                System.out.println("Bike parking not availaible");
            }

        }
        else
        {
            System.out.println("Given vehicle parking is not available");
        }
        
    }
    private void parkLargeVehicle(Vehicle vehicle)
    {
        Parkingspot largeParkingspot= new Parkingspot(ParkingSpotType.LARGE)
        largeParkingspot.setisFree(false);
        largeParkingspot.setVehicle(vehicle);
        vehicle.setParkingspot(largeParkingspot);
        LargeParkingSpotList.add(largeParkingspot);
        LargeSpotSize--;
        System.out.println("Truck parked successfully");


    }
    private void parkCompactVehicle(Vehicle vehicle)
    {
        Parkingspot compactParkingspot= new Parkingspot(ParkingSpotType.COMPACT)
        compactParkingspot.setisFree(false);
        compactParkingspot.setVehicle(vehicle);
        vehicle.setParkingspot(compactParkingspot);

        CompactParkingSpotList.add(compactParkingspot);
        CompactSpotSize--;
        System.out.println("Car parked successfully");

    }
    private void parkBikeVehicle(Vehicle vehicle)
    {
        Parkingspot bikeParkingspot= new Parkingspot(ParkingSpotType.BIKE)
        bikeParkingspot.setisFree(false);
        bikeParkingspot.setVehicle(vehicle);
        vehicle.setParkingspot(bikeParkingspot);

        BikeParkingSpotList.add(bikeParkingspot);
        BikeSpotSize--;
        System.out.println("Bike parked successfully");

    }
    public void unparkVehicle(Vehicle vehicle)
    {
        System.out.println("Unparking the vehicle "+ vehicle.getvehicletype);
        Parkingspot parkingspot=vehicle.getParkingspot();
        parkingspot.setisFree(true);
        

        if(vehicletype.TRUCK.equals(vehicle.getvehicletype))
        {
            LargeSpotSize++;
        }
        else if(vehicletype.CAR.equals(vehicle.getvehicletype))
        {
            CompactSpotSize++;
        }
        else
        {
            BikeSpotSize++;
        }
        System.out.println("Unparking the vehicle successfully");
    }

}
