import java.util.Scanner;

public class FinancesProgram {
    public static void main(String[] args) {
        //Initialize variables
        double income = 0;
        double expense = 0;
        double balance = 0;
        int choice;

        //Create a Scanner object
        Scanner sc = new Scanner(System.in);

        //Menu
        do{
            System.out.println("1. Enter income");
            System.out.println("2. Enter expense");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1 :
                    System.out.print("Enter amount of income: ");
                    income = sc.nextDouble();
                    balance += income;
                    System.out.println("Income is added to the balance.");
                    break;
                case 2 :
                    System.out.print("Enter amount of expense: ");
                    expense = sc.nextDouble();
                    if(expense > balance){
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= expense;
                        System.out.println("Expense is deducted from the balance.");
                    }
                    break;
                case 3 :
                    System.out.println("Current balance is : "+balance);
                    break;
                case 4 :
                    System.out.println("Exiting the program...");
                    break;
                default :
                    System.out.println("Invalid choice!");
                    break;
            }
        }while(choice != 4);
    }
}