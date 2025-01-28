//import java.util.Scanner;
public class AtmSimulator{
    static int balance=1000;
    static Scanner scanner=new Scanner(System.in);
    public static void checkBalance(){
        System.out.println(balance);
    }
    public static void withdrawcash(){
        System.out.print("enter the amount to withdraw:");
        
        int amount=scanner.nextInt();
        if(amount>balance){
            System.out.println("Insufficient money");
        }else{
            balance-=amount;
            System.out.println("withdrawal successful");

        }
        int c=Atm.balance-amount;
        System.out.println("amount after withdrow:"+c);
    }
    public static void pinchange(){
        System.out.println("enter currentpin:");
        int oldpin=scanner.nextInt();
        int currentpin=scanner.nextInt();
        if(oldpin==currentpin){
            System.out.println("enter newpin:");
            int newpin=scanner.nextInt();
            System.out.println("confirmppin");
            int confirmpin=scanner.nextInt();
            if(newpin==confirmpin){
                currentpin=newpin;
                System.out.println("pin changed successfully");
            }else{
                System.out.println("invalid currentpin");
            }

        }
        System.out.println("Atm");
        System.out.println("1.checkBalance");
        System.out.println("2.withdrawcash");
        System.out.println("3.pinchange");
        System.out.println("enter your choice");
        int choice=scanner.nextInt();
         switch(choice){
            case 1:
            checkBalance();
            break;
            case 2:
            withdrawcash();
            break;
            case 3:
            pinchange();
            break;
            default:
            System.out.println("invalid choice");
         }

        }
    }
