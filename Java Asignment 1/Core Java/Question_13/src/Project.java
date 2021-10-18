import java.util.Scanner;
public class Project {
    public static void main(String arg[]) {
        char r;
        do {
            System.out.println("*Library Management System**");
            System.out.println("Press 1 to add book");
            System.out.println("Press 2 to issue a book");
            System.out.println("Press 3 to return a book");
            System.out.println("Press 4 to print complete issue details");
            System.out.println("Press 5 to exit");
            Scanner obj1 = new Scanner(System.in);
            System.out.println("Enter any Number");
            int a = obj1.nextInt();
            switch (a) {
                case 1:
                    Library aa = new Library();
                    aa.add();
                    break;
                case 2:
                    Library bb = new Library();
                    bb.iss();
                    break;
                case 3:
                    Library cc = new Library();
                    cc.ret();
                    break;
                case 4:
                    Library is = new Library();
                    is.details();
                    break;
                case 5:
                    Library add = new Library();
                    add.exit();
                    break;
                default:
                    System.out.println("Invalid number");
            }
            System.out.println("Do you want to select next option(y/n)");
            r = obj1.next().charAt(0);

        }while (r == 'Y' || r == 'y') ;
        if (r == 'N' || r == 'n') {
            Library z = new Library();
            z.exit();
        }
    }
}


class Library {

    static String str, b, date;
    static int a, c;

    void add() {
        System.out.println("Enter the book name, Price and bookno");
        Scanner obj2 = new Scanner(System.in);
        String str = obj2.nextLine();
        float price = obj2.nextInt();
        int bookno = obj2.nextInt();
        System.out.println("your details are: " + str + "price"  +price + "bookno" + bookno);
    }

    void iss() {
        Scanner obj3 = new Scanner(System.in);
        System.out.println("Book Name");
        String str = obj3.nextLine();
        System.out.println("Book_id");
        a = obj3.nextInt();
        obj3.nextLine();
        System.out.println("issue date");
        b = obj3.nextLine();
        System.out.println("total no of book issued");
        c = obj3.nextInt();
        obj3.nextLine();
        System.out.println("Return book date");
        String date = obj3.nextLine();
    }

    int getid() {
        return a;
    }

    void ret() {
        System.out.println("Enter the Student_Name and book_id");
        Scanner c = new Scanner(System.in);
        String name = c.nextLine();
        int bookid = c.nextInt();
        if (a == bookid) {
            System.out.println("Total Details");
            System.out.println("Book_name:" + Library.str);
            System.out.println("Book_id:" + Library.a);
            System.out.println("Issue date:" + Library.b);
            System.out.println("Total number of book issued:" + Library.c);
            System.out.println("Book return date" + Library.date);
        } else {
            System.out.println("You entered the wrong id , Please dd the correct id kindly.");
        }

    }

    void details() {
        System.out.println("Book_name:" + Library.str);
        System.out.println("Book_id:" + Library.a);
        System.out.println("Issue date:" + Library.b);
        System.out.println("Total number of book issued:" + Library.c);
        System.out.println("Book return date" + Library.date);

    }

    void exit() {

    }

}
