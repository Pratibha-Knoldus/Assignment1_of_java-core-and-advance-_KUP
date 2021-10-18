package DishPackage;

import java.util.Arrays;
import java.util.List;


class  Dish{
    int dishId;
    String dishName;
    double creationTime;

    public Dish(int dishId,String dishName,double creationTime) { // create parameterize constructer
        super();
        this.dishId=dishId;
        this.dishName=dishName;
        this.creationTime=creationTime;
    }

    @Override  // override to string method
    public String toString() {
        return "Dish{" +
                "dishId=" + dishId +
                ", dishName='" + dishName + '\'' +
                ", creationTime=" + creationTime +
                '}';
    }
}
class Menu   {
    static List<Dish> menuList;

    static Dish obj2=new Dish(121,"paneer",10.5);
    static Dish obj3=new Dish(120," cholle",5.2);
    static Dish obj4=new Dish(122," Rajma",5.0);
    static Dish obj5=new Dish(123," Saahi panner",8.0);

    //        static ArrayList<Dish> menuList= new ArrayList<Dish>();
    static{
        menuList = Arrays.asList(obj2,obj3,obj4,obj5);
        //menuList.add(obj2);
    }

}
