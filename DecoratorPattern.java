
abstract class BasePizza
{
    public abstract int cost();
}

class FarmHousePizza extends BasePizza
{
    public int cost()
    {
        return 200;
    }
}

class MagarithaPizza extends BasePizza
{
    public int cost()
    {
        return 100;
    }
}

class VegDelightPizza extends BasePizza
{
    public int cost()
    {
        return 150;
    }
}

abstract class Topping extends BasePizza
{
    public abstract int cost();
}

class ExtraChees extends Topping
{
    BasePizza obj;
    public ExtraChees(BasePizza o)
    {
        obj=o;
    }

    public int cost()
    {
        return obj.cost()+10;
    }
}

class Corn extends Topping
{
    BasePizza obj;
    public Corn(BasePizza o)
    {
        obj=o;
    }
    public int cost()
    {
        return obj.cost()+20;
    }
}
public class DecoratorPattern {
    public static void main(String[] args) {
        BasePizza obj=new ExtraChees(new MagarithaPizza());
        BasePizza obj2=new Corn(new ExtraChees(new FarmHousePizza()));
        System.out.println(obj.cost());
        System.out.println(obj2.cost());
    }
    
}
