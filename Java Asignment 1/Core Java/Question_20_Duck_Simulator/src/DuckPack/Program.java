package DuckPack;

import java.util.*;

public class Program
{
    private enum DuckType
    {
        Rubber(0),
        Mallard(1),
        Redhead(2);

        public static final int SIZE = java.lang.Integer.SIZE;

        private int intValue;
        private static java.util.HashMap<Integer, DuckType> mappings;
        private static java.util.HashMap<Integer, DuckType> getMappings()
        {
            if (mappings == null)
            {
                synchronized (DuckType.class)
                {
                    if (mappings == null)
                    {
                        mappings = new java.util.HashMap<Integer, DuckType>();
                    }
                }
            }
            return mappings;
        }

        private DuckType(int value)
        {
            intValue = value;
            getMappings().put(value, this);
        }

        public int getValue()
        {
            return intValue;
        }

        public static DuckType forValue(int value)
        {
            return getMappings().get(value);
        }
    }


    public interface IShowDetail
    {
        void ShowDetails();
    }
    private static class Duck implements IShowDetail
    {
        private double weight;
        private int numberWings;
        private DuckType duckType = DuckType.values()[0];

        public Duck()
        {
        }

        public Duck(double weight, int numberWings, DuckType duckType)
        {
            this.weight = weight;
            this.numberWings = numberWings;
            this.duckType = duckType;
        }

        public void ShowDetails()
        {
            if (duckType == DuckType.Mallard)
            {
                System.out.println("Mallard duck:");
            }
            if (duckType == DuckType.Rubber)
            {
                System.out.println("Rubber duck:");
            }
            if (duckType == DuckType.Redhead)
            {
                System.out.println("Redhead duck:");
            }
            System.out.printf("Weight: %1$s" + "\r\n", weight);
            System.out.printf("Number of wings: %1$s" + "\r\n", numberWings);
        }
    }
    private static class RubberDuck extends Duck
    {
        public RubberDuck(double weight, int numberWings, DuckType duckType)
        {
            super(weight, numberWings, duckType);


        }
        @Override
        public void ShowDetails()
        {
            super.ShowDetails();
            System.out.println("Rubber ducks don’t fly and squeak.");
        }
    }
    private static class MallardDuck extends Duck
    {
        public MallardDuck(double weight, int numberWings, DuckType duckType)
        {
            super(weight, numberWings, duckType);


        }
        @Override
        public void ShowDetails()
        {
            super.ShowDetails();
            System.out.println("Mallard ducks fly fast and quack loud.");
        }
    }
    private static class RedheadDuck extends Duck
    {
        public RedheadDuck(double weight, int numberWings, DuckType duckType)
        {
            super(weight, numberWings, duckType);


        }
        @Override
        public void ShowDetails()
        {
            super.ShowDetails();
            System.out.println("Redhead ducks fly slow and quack mild.");
        }
    }


    public static void main(String[] args)
    {
        //Create ducks
        IShowDetail[] ducks = new IShowDetail[3];
        ducks[0] = new RubberDuck(12, 2, DuckType.Rubber);
        ducks[1] = new MallardDuck(9, 2, DuckType.Mallard);
        ducks[2] = new RedheadDuck(15, 4, DuckType.Redhead);



        for (int i = 0; i < 3; i++)
        {
            ducks[i].ShowDetails();
            System.out.println();
        }
        new Scanner(System.in).nextLine();
    }
}
