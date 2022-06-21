import java.util.Scanner;

public class Main{
    
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int a2 = keyboard.nextInt();
        String b2 = keyboard.nextLine();
        keyboard.nextLine();
        String c2 = keyboard.nextLine();
        Customer c = new Customer(a2, b2, c2);
        System.out.println("balance");
        double b = keyboard.nextDouble();
        System.out.println("min");
        double d = keyboard.nextDouble();
        System.out.println("amount");
        double f = keyboard.nextDouble();
        SavingsAccount a1 = new SavingsAccount(a, c, b, d);
        boolean e=a1.withdraw(f);
        if (e==true)
        System.out.println("withdraw successful");
        else
        System.out.println("failed");
        
    }
}
