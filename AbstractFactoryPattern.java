class Factory2
{
    Factory1 getCap(String in)
    {
        switch (in) {
            case "Ordinary":
                
                return new Ordinary();
            case "Luxary":
                
                return new Luxary();
        
            default:
                return null;
        }
    }
}

interface Factory1 
{

    
    Vehicle getVehicle(String inp);
}

class Ordinary implements Factory1
{
    public Vehicle getVehicle(String in)
    {
        switch (in) {
            
            case "Swift":
                
                return new Swift();

            case "Tata":
                
                return new Tata();
        
            default:
                return null;
        }
    }
}
class Luxary implements Factory1
{
    public Vehicle getVehicle(String in)
    {
        switch (in) {
            case "Marcede":
                
                return new Marcede();
            
        
            default:
                return null;
        }
    }
}

interface Vehicle
{
    void vehicleType();
}

class Marcede implements Vehicle
{
    public void vehicleType()
    {
        System.out.println("Marcede");
    }
}
class Swift implements Vehicle
{
    public void vehicleType()
    {
        System.out.println("Swift");
    }
}
class Tata implements Vehicle
{
    public void vehicleType()
    {
        System.out.println("Tata");
    }
}
public class AbstractFactoryPattern
{
    public static void main(String[] args) {

        Factory2 f2=new Factory2();
        Factory1 f1=(f2.getCap("Luxary"));
        Vehicle v1=(f1.getVehicle("Marcede"));
        v1.vehicleType();
        
    }
}