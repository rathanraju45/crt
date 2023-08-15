package Day5;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class BankingApp {
    Map<Integer, Customer> customer=new HashMap<>();
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BankingApp b=new BankingApp();
        int[] ids={101,102,103,104,105};
        int[] bal={1000,2000,3000,4000,5000};
        for(int i=0;i<5;i++){
            Customer c=new Customer(ids[i],bal[i]);
            b.customer.put(i,c);
        }
        System.out.println("Welcome to Banking Application.");
        boolean running=true;
        while (running) {
        System.out.println("1.Deposit\n2.Withdraw\n3.Display Balance\n4.Exit");
        System.out.print("Enter your choice");
        int choice=s.nextInt();
        s.nextLine();
        int id;
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter your id: ");
                    id = s.nextInt();
                    s.nextLine();
                    System.out.print("\nEnter the amount to deposit: ");
                    int dep_amnt = s.nextInt();
                    s.nextLine();
                    try {
                        if (dep_amnt < 0) {
                            throw new CustomeExceptions.NegativeAmount("Amount must be Positive value");
                        }
                        for (Map.Entry<Integer, Customer> k : b.customer.entrySet()) {
                            int initial_balance = k.getValue().getBalance();
                            if (k.getValue().getId() == id) {
                                k.getValue().setBalance(initial_balance + dep_amnt);
                                System.out.println("Rs." + dep_amnt + "Has been credited to your account.");
                                System.out.println("Your current balance is: " + k.getValue().getBalance());
                                break;
                            }
                        }
                    }
                    catch (CustomeExceptions.NegativeAmount e){
                        System.out.println("Error: "+e);
                    }
                }
                case 2 -> {
                    System.out.print("Enter your id: ");
                    id = s.nextInt();
                    s.nextLine();
                    System.out.print("\nEnter the amount to withdraw: ");
                    int withdraw_amnt = s.nextInt();
                    s.nextLine();
                    try {
                        if(withdraw_amnt<0){
                            throw new CustomeExceptions.NegativeAmount("Amount must be positive value");
                        }
                        for (Map.Entry<Integer, Customer> k : b.customer.entrySet()) {
                            int initial_balance = k.getValue().getBalance();
                            if (k.getValue().getId() == id) {
                                try {
                                    if(k.getValue().getBalance()<withdraw_amnt){
                                        throw new CustomeExceptions.InsufficientFunds("You have Insufficient Balance.");
                                    }
                                    k.getValue().setBalance(initial_balance - withdraw_amnt);
                                    System.out.println("Rs." + withdraw_amnt + "Has been debited from your account.");
                                    System.out.println("Your current balance is: " + k.getValue().getBalance());
                                    break;
                                }
                                catch (CustomeExceptions.InsufficientFunds e){
                                    System.out.println("Error: "+e);
                                }
                            }
                        }
                    }
                    catch (CustomeExceptions.NegativeAmount e){
                        System.out.println("Error: "+e);
                    }
                }
                case 3 -> {
                    System.out.print("\nEnter your id: ");
                    id = s.nextInt();
                    s.nextLine();
                    for (Map.Entry<Integer, Customer> k : b.customer.entrySet()) {
                        if (k.getValue().getId() == id) {
                            System.out.println(id + " : Your Balance is " + k.getValue().getBalance());
                            break;
                        }
                    }
                }
                case 4 -> {
                    running = false;
                    System.out.println("Thank you.");
                }
                default -> System.out.println("Enter the correct Input.");
            }
        }
    }
}
