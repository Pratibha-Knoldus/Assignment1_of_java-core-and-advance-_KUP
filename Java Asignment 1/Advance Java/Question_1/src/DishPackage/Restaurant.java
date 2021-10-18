package DishPackage;

import java.util.Scanner;

class Restaurent {


    public static void main(String... args) {
        Menu objMenu = new Menu();
        Scanner sc = new Scanner(System.in);

        int input ;

        do {
            System.out.println("***************Dish Menu*********************");
            System.out.println(" 1. Display Dish or 2. Search Dishes");

            input = sc.nextInt();
            if (input == 1) {

                // if input (press 1) is equal to 1 then it shows the menulist
                System.out.println(objMenu.menuList);
            } else if (input == 2) {
                // if input is equal to 2 then it prompt a message enter dishid if dish id is correct it shows Dish details
                System.out.println("enter dishId for search dish");
                int input2 = sc.nextInt();

                for (int i = 0; i < objMenu.menuList.size(); i++) {
                    if (input2 == objMenu.menuList.get(i).dishId) {
                        System.out.println(objMenu.menuList.get(i));
                    }
//                      else  {
//
//                              System.out.println("Id is not exit");
//
//                      }
                }

            }
        }
        while (input != 9) ;


    }
}
