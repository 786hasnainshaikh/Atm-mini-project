import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("welcome to abc bank");
        Scanner sc= new Scanner(System.in);
        int pin_count=-1;
        int actual_pin_code=123;
        int balance=1000;
        // taking pin code as input
        System.out.println("your current balance is : "+ balance);
        System.out.println("please enter the pin code");
        int pin_code=sc.nextInt();
        if (pin_code!=actual_pin_code){
            System.out.println("you have entered wrong try again");
            pin_code= sc.nextInt();
            if (pin_count==4){
                System.out.println("please collect your card");
            }
            pin_count=pin_count+1;
        }  else {
            System.out.println("press C balance, W for Withdraw, D for Deposit");
            String str= sc.next();
            if (str.equals("c") || str.equals("C")){
                System.out.println("your current balance is :" +balance);
            }

            if (str.equals("w") || str.equals("W")){
                System.out.println("enter withdraw money");
                int with_draw = sc.nextInt();
                if (with_draw>balance){
                    System.out.println("you can't withdraw more than balance");
                    System.out.println("your current balance is "+ balance);

                } else {
                    int result = balance - with_draw;
                    System.out.println("your previous balance was :" + balance);
                    System.out.println("your current balance after withdraw is :" + result);
                }
            }

            if (str.equals("d") || str.equals("D")){
                System.out.println("enter deposit money");
                int deposit=sc.nextInt();
                int result=balance+deposit;
                System.out.println("your previous balance was :" +balance);
                System.out.println("your current balance deposit is :" + result);
            }


            }




    }
}