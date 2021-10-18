// creating class Fruit with Copy Constructor
class Fruit
{
    private double fprice;
    private String fname;

    Fruit(double fPrice, String fName)
    {
        fprice = fPrice;
        fname = fName;
    }

    Fruit(Fruit fruit)
    {
        System.out.println("\nAfter invoking the Copy Constructor:\n");
        fprice = fruit.fprice;
        fname = fruit.fname;
    }

    double showPrice()
    {
        return fprice;
    }

    String showName()
    {
        return fname;
    }

    public static void main(String args[])
    {
        Fruit f1 = new Fruit(549, "Yellow Sweet Mango");
        System.out.println("Name of the first fruit: "+ f1.showName());
        System.out.println("Price of the first fruit: "+ f1.showPrice());

        //passing the parameters to the copy constructor
        Fruit f2 = new Fruit(f1);
        System.out.println("Name of the second fruit: "+ f2.showName());
        System.out.println("Price of the second fruit: "+ f2.showPrice());
    }
}