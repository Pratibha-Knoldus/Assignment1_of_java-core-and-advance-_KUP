import java.util.Scanner;

class FirstFactorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,fact=1;
        System.out.println("Enter a number between 1 to 18");
        int number= sc.nextInt(); //It is the number to calculate factorial
        if (number >= 1 && number <= 18 ){
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
        }
        else {
            System.out.println("Uh Oh! " + number + " is out of range");
        }

    }
}