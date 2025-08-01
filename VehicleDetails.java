class Vehicle
{
    String VehicleType;
    String VehicleNo;
    static int VehicleCount=0;
    public Vehicle(String VehicleNo,String VehicleType)
    {
    this.VehicleNo=VehicleNo;
    this.VehicleType=VehicleType;
    VehicleCount++;
    }
}
class Car extends Vehicle
{
    String VehicleName;
    Car(String VehicleName,String VehicleNo,String VehicleType)
    {
        super(VehicleNo,VehicleType);
        this.VehicleName=VehicleName;
    }
}
class Owner extends Car
{
    String OwnerName;
    String OwnerContact;
    Owner(String VehicleNo, String VehicleType, String VehicleName,String OwnerName,String OwnerContact)
    {
        super(VehicleNo,VehicleType,VehicleName);
        this.OwnerName=OwnerName;
        this.OwnerContact=OwnerContact;
    }
    public void display()
    {
        System.out.println("Owner Name: "+OwnerName);
        System.out.println("Owner Contact: "+OwnerContact);
        System.out.println("Vehicle Number: "+VehicleNo);
        System.out.println("Vehicle Type: "+VehicleType);
        System.out.println("VehicleName: "+VehicleName);
        System.out.println("Total No.Of Vehicles created: "+VehicleCount);
    }
}
class VehicleDetails
{
    public static void main(String args[])
    {
      Owner obj = new Owner("TN45CM2026","Four Wheeler", "KIA","Srijha", "9345291190");
      obj.display();
    }
}