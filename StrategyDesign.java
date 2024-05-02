
interface AllCapacity
{
    void drive();
}

class NormalCapacity implements AllCapacity
{
    public void drive()
    {
        System.out.println("Normal Capacity");
    }
}

class SpecialCapacity implements AllCapacity{
    public void drive()
    {
        System.out.println("Special Capacity");
    }
}

class Vehicle
{
    AllCapacity object;
    public Vehicle(AllCapacity obj)
    {
        this.object=obj;
    }

    public void drive()
    {
        object.drive();
    }
}

class OffRoad extends Vehicle
{
    public OffRoad()
    {
        super(new SpecialCapacity());
    }
}
class SportVehicle extends Vehicle
{
    public SportVehicle()
    {
        super(new SpecialCapacity());
    }
}

class GoodsVehicle extends Vehicle
{
    public GoodsVehicle()
    {
        super(new NormalCapacity());
    }
}
public class StrategyDesign
{
    public static void main(String[] args) {
        Vehicle vc= new SportVehicle();
        vc.drive();
        vc=new GoodsVehicle();
        vc.drive();
        vc=new OffRoad();
        vc.drive();
        
    }
}