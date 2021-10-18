import java.util.Scanner;



class  CoffeShop {
    int order;
    int cost;
    int token_no;


    //String str="";
    void Cashier()
    {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("                   Welcome to our Coffee Shop     " +
                    "please Select Your Order        :");
            System.out.println("press 1 for CARAMEL MACCHIATO -------> 20 Rs\n" +
                    "press 2 for CAFÉ MOCHA-------------> 30 Rs\n" +
                    "press 3 for AMERICANO------------->40 Rs\n" +
                    "press 4 for TURKISH COFFEE -----------> 50 Rs\n" +
                    "press 5 for Hazelnut-------------> 100 Rs");


            System.out.println("Enter Your Order :");
            order = sc.nextInt();

            System.out.println("Please pay the cost of Order " + order + " " + "flavour:");
            cost = sc.nextInt();

        }
        catch(Exception e){
            System.out.println("exception is: "+e);
        }
    }

    void Customer()
    {
        try {
            if ((order==1) && (cost == 20)) {
                token_no = 10;
                System.out.println("Your Token no is :" + token_no);
                System.out.println("please Wait 2 min for Your order(CARAMEL MACCHIATO) :");
            } else if ((order== 2) && (cost == 30)) {
                token_no = 20;
                System.out.println("Your Token no is  :" + token_no);
                System.out.println("please Wait 3 min for Your order(CAFÉ MOCHA) :");
            } else if (( order==3 ) && (cost == 40)) {
                token_no = 30;
                System.out.println("Your Token no is :" + token_no);
                System.out.println("please Wait 3 min for Your order(AMERICANO) :");
            } else if ((order==4 ) && (cost == 50)) {
                token_no = 400;
                System.out.println("Your Token no is  :" + token_no);
                System.out.println("please Wait 3 min for Your order(TURKISH COFFEE) :");
            } else if ((order==5) && (cost == 60)) {
                token_no = 50;
                System.out.println("Your Token no is :" + token_no);
                System.out.println("please Wait 3 min for Your order(Hazelnut) :");
            } else {
                System.out.println("either Your choice is not available in our store or you have not paid right amount  :");
            }
        }
        catch(Exception e){
            System.out.println("Exception is:  "+e);
        }
    }
    void Barista() throws InterruptedException {
        try {
            Thread.sleep(5000);
            if (token_no == 10) {
                System.out.println("please collect Your Order" + order);
                Thread.sleep(2000);
                System.out.println("You have paid Rs" + cost + " for Your Order" + "\n" + "Welcome Again!");
            }
            if (token_no == 20) {
                System.out.println("please collect Your Order" + order);
                Thread.sleep(2000);
                System.out.println("You have paid Rs" + cost + " for Your Order" + "\n" + "Welcome Again!");

            }
            if (token_no == 30) {
                System.out.println("please collect Your Order" + order);
                Thread.sleep(2000);
                System.out.println("You have paid Rs" + cost + " for Your Order" + "\n" + "Welcome Again!");

            }
            if (token_no == 40) {
                System.out.println("please collect Your Order" + order);
                Thread.sleep(2000);
                System.out.println("You have paid Rs" + cost + " for Your Order" + "\n" + "Welcome Again!");

            }
            if (token_no == 50) {
                System.out.println("please collect Your Order :" + order);
                Thread.sleep(2000);
                System.out.println("You have paid Rs" + cost + " for Your Order" + "\n" + "Welcome Again!");
            }
        }
        catch(Exception e){
            System.out.println("Exception is:  "+e);

        }
    }
    void exit(){

    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        CoffeShop coffeShop = new CoffeShop();
        Scanner sc=new Scanner(System.in);

        char wantToExit;
        do {
            coffeShop.Cashier();
            coffeShop.Customer();
            coffeShop.Barista();


            System.out.println("Do you want to select next option(y/n)");
            wantToExit = sc.next().charAt(0);

        }
        while (wantToExit == 'Y' || wantToExit == 'y') ;
        if (wantToExit == 'N' || wantToExit == 'n') {

            coffeShop.exit();
        }
    }

}