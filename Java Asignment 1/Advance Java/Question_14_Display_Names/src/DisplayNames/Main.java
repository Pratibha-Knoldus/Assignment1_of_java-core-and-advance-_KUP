package DisplayNames;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the choice:");
        System.out.println("\n1.Accept first name and surname\n2.display total name\n3.Exit.");

        int choice=sc.nextInt();
        Vector v1=new Vector ();

        while(choice !=3)
        {
            if(choice==1)
            {
                System.out.println("enter the first name and surname:");
                String n=sc.nextLine();
                v1.add( new Name( sc.next(), sc.next()));
            }
            System.out.println("enter the choice:");
            System.out.println("\n1.Accept first name and surname\n \n2.display total name\n3.Exit.");
                    choice=sc.nextInt();
            if(choice==2)
            {
                System.out.println("Here is total:"+v1.size());
                v1.forEach(System.out::println);
            }
        }
        System.out.println("thank you");
    }


}

