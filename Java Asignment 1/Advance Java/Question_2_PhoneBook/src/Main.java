import java.util.*;

class PhoneEntry
{
    String name;    // name of a person
    String phone;   // their phone number

    PhoneEntry( String n, String p )
    {
        name = n; phone = p;
    }
}

class PhoneBook
{
    PhoneEntry[] phoneBook;

    PhoneBook()    // constructor
    {
        phoneBook = new PhoneEntry[ 10 ] ;

        phoneBook[0] = new PhoneEntry( "Pratibha", "9193126545" );
        phoneBook[1] = new PhoneEntry( "Swaraj Singh",  "9863465713" );
        phoneBook[2] = new PhoneEntry( "Rishab Pant", "7594334912" );
        phoneBook[3] = new PhoneEntry( "Mukul Yadav",  "8234926545" );
        phoneBook[4] = new PhoneEntry( "Ibrahim",     "7000026545" );
        phoneBook[5] = new PhoneEntry( null, null );
        phoneBook[6] = new PhoneEntry( null, null );
        phoneBook[7] = new PhoneEntry( null, null );
        phoneBook[8] = new PhoneEntry( null, null );
        phoneBook[9] = new PhoneEntry( null, null );
    }

    PhoneEntry search( String targetName )
    {
        for ( int i = 0 ; i < phoneBook.length ; i++ )
        {
            if ( phoneBook[i] != null && phoneBook[i].name.equals( targetName ) )
            {
                return phoneBook[i];
            }
        }
        return null;
    }

    PhoneEntry addEntry( String addName, String addNumber )
    {
        boolean found = false;
        for ( int i = 0 ; i < phoneBook.length ; i++ )
        {
            if ( phoneBook[i].name == null )
            {
                phoneBook[i] = new PhoneEntry( addName, addNumber );
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Phone book is full! Delete an entry first!");
        }
        return null; // I'm not sure what you wish to return here
    }
}

class Main
{
    public static void main ( String[] args )
    {
        PhoneBook pb = new PhoneBook();
        Scanner scan = new Scanner( System.in );
        String tempName, tempNumber;

        // INITIAL WELCOME MESSAGE START

        System.out.println();
        System.out.println("**********************");
        System.out.println("***** PHONE BOOK *****");
        System.out.println("**********************");
        System.out.println();
        System.out.println(" 1  Search for an entry");
        System.out.println(" 2  Add a new entry");
        System.out.println(" 3  Delete an entry");
        System.out.println(" 4  Quit program");
        System.out.println();
        System.out.print("Enter a command: ");

        String userInput = scan.nextLine();
        PhoneEntry entry;
        System.out.println();

        // INITIAL WELCOME MESSAGE END

        while ( userInput != "quit" )
        {
            if ( userInput.equals("1") )        //  NAME SEARCH
            {
                System.out.println("    NAME SEARCH START");
                System.out.println("**********************");
                System.out.println("***** NAME SEARCH ****");
                System.out.println("**********************");
                System.out.println();
                System.out.print("Enter a name: ");
                userInput = scan.nextLine();
                entry = pb.search( userInput );

                if ( entry != null )
                {
                    System.out.println();
                    System.out.println( "  " + entry.name + ": " + entry.phone );
                    System.out.println();
                }
                else if ( userInput.equals("quit") )
                {
                    break;
                }
                else
                {
                    System.out.println("Name not found.");
                    System.out.println();
                }
                System.out.println("    NAME SEARCH END");
                System.out.println();
            }
            else if ( userInput.equals("2") )   //  ADD ENTRY
            {
                System.out.println("    ADD ENTRY START");

                System.out.println("**********************");
                System.out.println("***** ADD ENTRY ******");
                System.out.println("**********************");
                System.out.println();

                System.out.print("Enter full name: ");
                tempName = scan.nextLine();

                System.out.print("Enter phone number: ");
                tempNumber = scan.nextLine();

                entry = pb.addEntry( tempName, tempNumber );

                //System.out.println("Phone book is full! Delete an entry first!");

                System.out.println("    ADD ENTRY END");
                System.out.println();
            }
            else if ( userInput.equals("3") )   //  DELETE ENTRY
            {
                System.out.println("    DELETE ENTRY START");

                System.out.println("**********************");
                System.out.println("**** DELETE ENTRY ****");
                System.out.println("**********************");
                System.out.println();

                System.out.print("Enter full name: ");
                userInput = scan.nextLine();

                System.out.println("    DELETE ENTRY END");
                System.out.println();
            }
            else if ( userInput.equals("4") )   //  QUIT PROGRAM
            {
                System.out.println();
                break;
            }

            //System.out.println("Select a command:");
            System.out.println("**********************");
            System.out.println("**********************");
            System.out.println("**********************");
            System.out.println();
            System.out.println(" 1  Search for an entry");
            System.out.println(" 2  Add a new entry");
            System.out.println(" 3  Delete an entry");
            System.out.println(" 4  Quit program");
            System.out.println();
            System.out.print("Enter a command: ");
            userInput = scan.nextLine();
        }
        System.out.println("Goodbye.");
    }
}